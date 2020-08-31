/*
 * Copyright 2020 Armory, Inc.
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
package io.zendesk.pipeline.validation;

import com.netflix.spinnaker.front50.validator.PipelineValidator;
import com.netflix.spinnaker.front50.model.pipeline.Pipeline;
import com.netflix.spinnaker.front50.exceptions.InvalidEntityException;
import org.springframework.validation.Errors;
import lombok.extern.slf4j.Slf4j;
import org.pf4j.Extension;

@Slf4j
@Extension
public class OpaValidationEngine implements PipelineValidator {

    public OpaValidationEngine(OpaValidationConfig configuration) {
        log.info("Configuring OpaValidationEngine with");
    }

    public void validate(Pipeline pipeline, Errors errors) {
    	throw new InvalidEntityException("A pipeline OpaValidation failed");
    }

}
