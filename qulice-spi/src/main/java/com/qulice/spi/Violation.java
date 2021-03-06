/**
 * Copyright (c) 2011-2016, Qulice.com
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
 */
package com.qulice.spi;

import lombok.EqualsAndHashCode;
import lombok.ToString;

/**
 * Validation result.
 * @author Krzysztof Krason (Krzysztof.Krason@gmail.com)
 * @version $Id$
 * @since 0.17
 */
public interface Violation {

    /**
     * Validation message.
     * @return Validation message.
     */
    String message();

    /**
     * Validated file.
     * @return Validated file.
     */
    String file();

    /**
     * Default validation result.
     * @todo #61:30min Let's split the message part into lines, message and
     *  check name. After it is done fix
     *  CheckstyleValidatorTest.ViolationsMatcher to handle all those parameters
     *  and fix all failing tests.
     */
    @EqualsAndHashCode
    @ToString
    class Default implements Violation {

        /**
         * Validation message.
         */
        private final String msg;

        /**
         * Validated file.
         */
        private final String res;

        /**
         * Constructor.
         * @param msg Validation message
         * @param res Vallidated file
         */
        public Default(final String msg, final String res) {
            this.msg = msg;
            this.res = res;
        }

        @Override
        public String message() {
            return this.msg;
        }

        @Override
        public String file() {
            return this.res;
        }
    }

}
