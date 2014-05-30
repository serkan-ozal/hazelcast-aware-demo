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

import java.util.ArrayList;
import java.util.List;

import com.hazelcast.aware.config.provider.HazelcastAwareConfigProvider;
import com.hazelcast.aware.config.provider.annotation.HazelcastAwareClass;
import com.hazelcast.config.Config;
import com.hazelcast.config.GroupConfig;
import com.hazelcast.config.JoinConfig;
import com.hazelcast.config.MulticastConfig;
import com.hazelcast.config.NetworkConfig;

/**
 * @author Serkan ÖZAL
 * 
 * Contact Informations:
 * 		GitHub   : https://github.com/serkan-ozal
 * 		LinkedIn : www.linkedin.com/in/serkanozal
 */
@HazelcastAwareClass
public class HazelcastInstanceConfigProvider implements HazelcastAwareConfigProvider {

	private List<Config> configs = new ArrayList<Config>();
	
	public HazelcastInstanceConfigProvider() {
		init();
	}
	
	/**
	<hz:config>
       <!-- Hazelcast Instance Name -->
       <hz:instance-name>hazelcast-aware-demo-instance</hz:instance-name>
       <!-- Hazelcast Group Name and Password -->
       <hz:group name="hazelcast-aware-demo" password="$$$_hazelcast-aware-demo_$$$" />
       <!-- Hazelcast Network Configuration -->
       <hz:network port="5701" port-auto-increment="true">
           <hz:join>
               <hz:multicast enabled="true"/>
               <hz:tcp-ip enabled="false"/>
           </hz:join>
       </hz:network>
   	</hz:config>
	*/
	private void init() {
		Config config = new Config();
		config.setInstanceName("hazelcast-aware-demo-instance");
		config.setGroupConfig(
				new GroupConfig(
						"hazelcast-aware-demo", 
						"$$$_hazelcast-aware-demo_$$$"));
		config.setNetworkConfig(
				new NetworkConfig().
						setPort(5701).
						setPortAutoIncrement(true).
						setJoin(
								new JoinConfig().
										setMulticastConfig(
												new MulticastConfig().
														setEnabled(true))));
		configs.add(config);
	}
	
	@Override
	public List<Config> provideConfigs() {
		return configs;
	}

}
