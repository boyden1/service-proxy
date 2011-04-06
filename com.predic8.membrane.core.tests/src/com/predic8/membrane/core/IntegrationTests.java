/* Copyright 2009 predic8 GmbH, www.predic8.com

   Licensed under the Apache License, Version 2.0 (the "License");
   you may not use this file except in compliance with the License.
   You may obtain a copy of the License at

   http://www.apache.org/licenses/LICENSE-2.0

   Unless required by applicable law or agreed to in writing, software
   distributed under the License is distributed on an "AS IS" BASIS,
   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
   See the License for the specific language governing permissions and
   limitations under the License. */
package com.predic8.membrane.core;

import junit.framework.Test;
import junit.framework.TestSuite;

import com.predic8.membrane.core.http.MethodTest;
import com.predic8.membrane.core.interceptor.RegExReplaceInterceptorTest;
import com.predic8.membrane.core.interceptor.ValidateSOAPMsgInterceptorTest;
import com.predic8.membrane.core.interceptor.rewrite.SimpleURLRewriteInterceptorIntegrationTest;
import com.predic8.membrane.integration.AccessControlInterceptorIntegrationTest;
import com.predic8.membrane.integration.Http10Test;
import com.predic8.membrane.integration.Http11Test;
import com.predic8.membrane.integration.ProxyRuleTest;
import com.predic8.membrane.interceptor.LoadBalancingInterceptorTest;

public class IntegrationTests {

	
	public static Test suite() {
		TestSuite suite = new TestSuite("Integration tests for com.predic8.membrane.core");
		//$JUnit-BEGIN$
		suite.addTestSuite(MethodTest.class);
		suite.addTestSuite(RegExReplaceInterceptorTest.class);
		suite.addTestSuite(Http10Test.class);
		suite.addTestSuite(Http11Test.class);
		suite.addTestSuite(ProxyRuleTest.class);
		suite.addTestSuite(AccessControlInterceptorIntegrationTest.class);
		suite.addTestSuite(LoadBalancingInterceptorTest.class);
		suite.addTestSuite(SimpleURLRewriteInterceptorIntegrationTest.class);
		suite.addTestSuite(ValidateSOAPMsgInterceptorTest.class);
		//$JUnit-END$
		return suite;
	}

}