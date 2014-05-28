/*
 * Copyright 2002-2014 the original author or authors.
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

package com.hazelcast.aware.demo;

import java.util.Map;

import com.hazelcast.aware.config.provider.annotation.HazelcastAwareClass;
import com.hazelcast.aware.config.provider.annotation.HazelcastAwareMapField;

/**
 * @author Serkan ÖZAL
 * 
 * Contact Informations:
 * 		GitHub   : https://github.com/serkan-ozal
 * 		LinkedIn : www.linkedin.com/in/serkanozal
 */
@HazelcastAwareClass
public class HazelcastAwareBean2 {

	@HazelcastAwareMapField
	private Map<Long, String> map1;
	
	@HazelcastAwareMapField(mapName = "map2")
	private Map<Long, String> map2;

	public Map<Long, String> getMap1() {
		return map1;
	}
	
	public void setMap1(Map<Long, String> map1) {
		this.map1 = map1;
	}
	
	public Map<Long, String> getMap2() {
		return map2;
	}
	
	public void setMap2(Map<Long, String> map2) {
		this.map2 = map2;
	}
	
}
