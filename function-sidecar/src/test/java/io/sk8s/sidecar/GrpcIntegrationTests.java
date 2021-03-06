/*
 * Copyright 2017 the original author or authors.
 *
 *   Licensed under the Apache License, Version 2.0 (the "License");
 *   you may not use this file except in compliance with the License.
 *   You may obtain a copy of the License at
 *
 *        http://www.apache.org/licenses/LICENSE-2.0
 *
 *   Unless required by applicable law or agreed to in writing, software
 *   distributed under the License is distributed on an "AS IS" BASIS,
 *   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *   See the License for the specific language governing permissions and
 *   limitations under the License.
 */

package io.sk8s.sidecar;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * Test with the samples/grpc image standalone
 *
 * samples/grpc/dockerize
 * docker run --rm -it -p:10382:10382 sk8s/grpc-py:latest
 *
 * @author David Turanski
 **/
@SpringBootTest(classes = DispatcherConfiguration.class)
@RunWith(SpringRunner.class)
@ActiveProfiles("grpc")
public class GrpcIntegrationTests {
	@Autowired Dispatcher dispatcher;

	@Ignore
	@Test
	public void test() throws Exception {
		assertThat(dispatcher.dispatch("hello")).isEqualTo("HELLO");
		assertThat(dispatcher.dispatch("world")).isEqualTo("WORLD");

	}
}
