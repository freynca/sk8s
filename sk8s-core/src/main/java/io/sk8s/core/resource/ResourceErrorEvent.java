/*
 * Copyright 2017 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package io.sk8s.core.resource;

import io.fabric8.kubernetes.client.Watcher;

/**
 * Specialization of {@link ResourceEvent} for when a watch reports an error.
 * @author Eric Bottard
 * @param <T> the type of resource that is in error
 */
public class ResourceErrorEvent<T> extends ResourceEvent<T> {

	ResourceErrorEvent(T resource) {
		super(resource, Watcher.Action.ERROR);
	}
}
