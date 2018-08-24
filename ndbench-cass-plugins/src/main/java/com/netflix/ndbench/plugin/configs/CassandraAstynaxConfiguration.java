/*
 *  Copyright 2018 Netflix, Inc.
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 *
 */
package com.netflix.ndbench.plugin.configs;

import com.netflix.archaius.api.annotations.Configuration;
import com.netflix.archaius.api.annotations.DefaultValue;
import com.netflix.ndbench.api.plugin.common.NdBenchConstants;

@Configuration(prefix =  NdBenchConstants.PROP_NAMESPACE +  "cass")
public interface CassandraAstynaxConfiguration extends CassandraConfigurationBase {
    @DefaultValue("emp_thrift")
    String getCfname();

    @DefaultValue("CL_LOCAL_ONE")
    String getReadConsistencyLevel();

    @DefaultValue("CL_LOCAL_ONE")
    String getWriteConsistencyLevel();

    @DefaultValue("5")
    Long getColsPerRow();
}
