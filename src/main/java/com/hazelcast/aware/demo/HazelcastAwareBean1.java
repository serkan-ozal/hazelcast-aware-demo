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

import java.util.List;
import java.util.Map;

import com.hazelcast.aware.config.provider.annotation.HazelcastAwareClass;
import com.hazelcast.aware.config.provider.annotation.HazelcastAwareMapField;
import com.hazelcast.aware.config.provider.annotation.HazelcastAwareListField;

/**
 * @author Serkan ÖZAL
 * 
 * Contact Informations:
 * 		GitHub   : https://github.com/serkan-ozal
 * 		LinkedIn : www.linkedin.com/in/serkanozal
 */
@HazelcastAwareClass
public class HazelcastAwareBean1 {

	@HazelcastAwareMapField
	private Map<Long, String> map1;
	
	@HazelcastAwareMapField(name = "map2")
	private Map<Long, String> map2;
	
	@HazelcastAwareListField
	private List<Long> list1;
	
	@HazelcastAwareListField(name = "list2")
	private List<Long> list2;
	
	public HazelcastAwareBean1() {
		
	}

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
	
	public List<Long> getList1() {
		return list1;
	}
	
	public void setList1(List<Long> list1) {
		this.list1 = list1;
	}
	
	public List<Long> getList2() {
		return list2;
	}
	
	public void setList2(List<Long> list2) {
		this.list2 = list2;
	}
	
}
