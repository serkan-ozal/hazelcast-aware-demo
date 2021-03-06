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
import java.util.Random;

import com.hazelcast.aware.HazelcastAware;

/**
 * @author Serkan ÖZAL
 * 
 * Contact Informations:
 * 		GitHub   : https://github.com/serkan-ozal
 * 		LinkedIn : www.linkedin.com/in/serkanozal
 */
public class HazelcastAwareDemo extends HazelcastAware { 
	// or call "HazelcastAwarer.makeHazelcastAware();" instead of extending from "HazelcastAware" class.

	public static void main(String[] args) throws Exception {
		HazelcastAwareBean1 bean1a = new HazelcastAwareBean1();
		HazelcastAwareBean1 bean1b = new HazelcastAwareBean1();
		HazelcastAwareBean2 bean2 = new HazelcastAwareBean2();
		
		Random r = new Random();
		
		for (int i = 0; i < 10; i++) {
			Long value1 = r.nextLong();
			Long value2 = r.nextLong();
			bean1a.getMap1().put(value1, "Value of " + value1);
			bean1a.getMap2().put(value2, "Value of " + value2);
			bean1a.getList1().add(r.nextLong());
			bean1a.getList2().add(r.nextLong());
		}
		
		System.out.println("HazelcastAwareBean1[1a] Map1: ");
		printMap(bean1a.getMap1());
		
		System.out.println();
		
		System.out.println("HazelcastAwareBean1[1a] Map2: ");
		printMap(bean1a.getMap2());
		
		System.out.println();
		
		System.out.println("HazelcastAwareBean1[1a] List1: ");
		printList(bean1a.getList1());
		
		System.out.println();
		
		System.out.println("HazelcastAwareBean1[1a] List2: ");
		printList(bean1a.getList2());
		
		System.out.println();
		
		System.out.println("HazelcastAwareBean1[1b] Map1: ");
		printMap(bean1b.getMap1());
		
		System.out.println();
		
		System.out.println("HazelcastAwareBean1[1b] Map2: ");
		printMap(bean1b.getMap2());
		
		System.out.println();
		
		System.out.println("HazelcastAwareBean1[1b] List1: ");
		printList(bean1b.getList1());
		
		System.out.println();
		
		System.out.println("HazelcastAwareBean1[1b] List2: ");
		printList(bean1b.getList2());
		
		System.out.println();
		
		System.out.println("HazelcastAwareBean2 Map1: ");
		printMap(bean2.getMap1());
		
		System.out.println();
		
		System.out.println("HazelcastAwareBean2 Map2: ");
		printMap(bean2.getMap2());
		
		System.out.println();
		
		System.out.println("HazelcastAwareBean2 List1: ");
		printList(bean2.getList1());
		
		System.out.println();
		
		System.out.println("HazelcastAwareBean2 List2: ");
		printList(bean2.getList2());
		
		System.out.println();
	}
	
	private static void printMap(Map<Long, String> map) {
		System.out.println("==============================");
		if (map == null || map.isEmpty()) {
			System.out.println("Map is empty !");
		}
		else {
			for (Long key : map.keySet()) {
				System.out.println(key + ": " + map.get(key));
			}
		}	
		System.out.println("==============================");
	}
	
	private static void printList(List<Long> list) {
		System.out.println("==============================");
		if (list == null || list.isEmpty()) {
			System.out.println("List is empty !");
		}
		else {
			for (Long element : list) {
				System.out.println(element);
			}
		}	
		System.out.println("==============================");
	}

}
