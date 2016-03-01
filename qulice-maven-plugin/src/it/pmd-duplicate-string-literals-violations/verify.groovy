/**
 *
 * Copyright (c) 2011, Qulice.com
 * All rights reserved.
 *
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions
 * are met: 1) Redistributions of source code must retain the above
 * copyright notice, this list of conditions and the following
 * disclaimer. 2) Redistributions in binary form must reproduce the above
 * copyright notice, this list of conditions and the following
 * disclaimer in the documentation and/or other materials provided
 * with the distribution. 3) Neither the name of the Qulice.com nor
 * the names of its contributors may be used to endorse or promote
 * products derived from this software without specific prior written
 * permission.
 *
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS
 * "AS IS" AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT
 * NOT LIMITED TO, THE IMPLIED WARRANTIES OF MERCHANTABILITY AND
 * FITNESS FOR A PARTICULAR PURPOSE ARE DISCLAIMED. IN NO EVENT SHALL
 * THE COPYRIGHT HOLDER OR CONTRIBUTORS BE LIABLE FOR ANY DIRECT,
 * INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES
 * (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR
 * SERVICES; LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION)
 * HOWEVER CAUSED AND ON ANY THEORY OF LIABILITY, WHETHER IN CONTRACT,
 * STRICT LIABILITY, OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE)
 * ARISING IN ANY WAY OUT OF THE USE OF THIS SOFTWARE, EVEN IF ADVISED
 * OF THE POSSIBILITY OF SUCH DAMAGE.
 *
 * Validate that the build really failed and violations were reported
 * because of PMD AvoidDuplicateLiterals.
 * @version $Id$
 * @since 0.17
 */
def log = new File(basedir, 'build.log')
assert !log.text.contains('MultipleStringLiteralsCheck')
assert !log.text.contains('SuppressDuplicateStringLiterals.java')
assert !log.text.contains('WithoutDuplicateStringLiterals.java')
assert log.text.contains('No Checkstyle violations found')
assert log.text.contains('FourDuplicateStringLiterals.java[46-46]: The String '
    + 'literal "test" appears 4 times in this file; the first occurrence is on line 46 (AvoidDuplicateLiterals)')
assert log.text.contains('TwoDuplicateStringLiterals.java[45-45]: The String '
    + 'literal "test" appears 2 times in this file; the first occurrence is on line 45 (AvoidDuplicateLiterals)')
assert log.text.contains('Failure: 2 PMD violations')