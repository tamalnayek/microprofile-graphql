/*
 * Copyright (c) 2020 Contributors to the Eclipse Foundation
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.eclipse.microprofile.graphql.client.core;

import java.util.List;

public interface Operation extends Buildable {

    enum Type {
        QUERY,
        MUTATION,
        SUBSCRIPTION
    }

    Type getType();
    void setType(Type type);

    String getName();
    void setName(String name);

    List<? extends Variable> getVariables();
    void setVariables(List<? extends Variable> vars);

    List<? extends Field> getFields();
    void setFields(List<? extends Field> fields);
}
