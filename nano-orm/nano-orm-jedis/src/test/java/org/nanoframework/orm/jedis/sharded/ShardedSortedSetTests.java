/*
 * Copyright 2015-2016 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.nanoframework.orm.jedis.sharded;

import java.io.IOException;

import org.junit.Before;
import org.nanoframework.commons.loader.LoaderException;
import org.nanoframework.orm.jedis.GlobalRedisClient;
import org.nanoframework.orm.jedis.cluster.SortedSetTests;

/**
 *
 * @author yanghe
 * @since 0.0.1
 */
public class ShardedSortedSetTests extends SortedSetTests {

    @Before
    public void before() throws LoaderException, IOException {
        if (redisClient == null) {
            try {
                redisClient = GlobalRedisClient.get("sharded");
            } catch (final Throwable e) {
                // ignore
            }
        }
    }

}
