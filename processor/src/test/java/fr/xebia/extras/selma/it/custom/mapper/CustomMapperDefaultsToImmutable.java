/*
 * Copyright 2013  Séven Le Mesle
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
 * 
 */
package fr.xebia.extras.selma.it.custom.mapper;

import fr.xebia.extras.selma.Mapper;
import fr.xebia.extras.selma.beans.PersonIn;
import fr.xebia.extras.selma.beans.PersonOut;

/**
 * Created by slemesle on 19/11/14.
 */
@Mapper(withCustom = CustomImmutableMapper.class,
        withIgnoreFields = {"fr.xebia.extras.selma.beans.PersonIn.male", "fr.xebia.extras.selma.beans.PersonOut.biography"})
public interface CustomMapperDefaultsToImmutable {

    PersonOut mapWithCustom(PersonIn in);

    PersonOut mapWithCustom(PersonIn in, PersonOut out);
}
