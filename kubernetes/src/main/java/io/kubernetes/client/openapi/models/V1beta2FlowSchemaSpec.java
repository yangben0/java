/*
Copyright 2023 The Kubernetes Authors.
Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at
http://www.apache.org/licenses/LICENSE-2.0
Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.
*/
package io.kubernetes.client.openapi.models;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.kubernetes.client.openapi.models.V1beta2FlowDistinguisherMethod;
import io.kubernetes.client.openapi.models.V1beta2PolicyRulesWithSubjects;
import io.kubernetes.client.openapi.models.V1beta2PriorityLevelConfigurationReference;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * FlowSchemaSpec describes how the FlowSchema&#39;s specification looks like.
 */
@ApiModel(description = "FlowSchemaSpec describes how the FlowSchema's specification looks like.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-12-01T19:05:21.333462Z[Etc/UTC]")
public class V1beta2FlowSchemaSpec {
  public static final String SERIALIZED_NAME_DISTINGUISHER_METHOD = "distinguisherMethod";
  @SerializedName(SERIALIZED_NAME_DISTINGUISHER_METHOD)
  private V1beta2FlowDistinguisherMethod distinguisherMethod;

  public static final String SERIALIZED_NAME_MATCHING_PRECEDENCE = "matchingPrecedence";
  @SerializedName(SERIALIZED_NAME_MATCHING_PRECEDENCE)
  private Integer matchingPrecedence;

  public static final String SERIALIZED_NAME_PRIORITY_LEVEL_CONFIGURATION = "priorityLevelConfiguration";
  @SerializedName(SERIALIZED_NAME_PRIORITY_LEVEL_CONFIGURATION)
  private V1beta2PriorityLevelConfigurationReference priorityLevelConfiguration;

  public static final String SERIALIZED_NAME_RULES = "rules";
  @SerializedName(SERIALIZED_NAME_RULES)
  private List<V1beta2PolicyRulesWithSubjects> rules = null;


  public V1beta2FlowSchemaSpec distinguisherMethod(V1beta2FlowDistinguisherMethod distinguisherMethod) {

    this.distinguisherMethod = distinguisherMethod;
    return this;
  }

   /**
   * Get distinguisherMethod
   * @return distinguisherMethod
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public V1beta2FlowDistinguisherMethod getDistinguisherMethod() {
    return distinguisherMethod;
  }


  public void setDistinguisherMethod(V1beta2FlowDistinguisherMethod distinguisherMethod) {
    this.distinguisherMethod = distinguisherMethod;
  }


  public V1beta2FlowSchemaSpec matchingPrecedence(Integer matchingPrecedence) {

    this.matchingPrecedence = matchingPrecedence;
    return this;
  }

   /**
   * &#x60;matchingPrecedence&#x60; is used to choose among the FlowSchemas that match a given request. The chosen FlowSchema is among those with the numerically lowest (which we take to be logically highest) MatchingPrecedence.  Each MatchingPrecedence value must be ranged in [1,10000]. Note that if the precedence is not specified, it will be set to 1000 as default.
   * @return matchingPrecedence
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "`matchingPrecedence` is used to choose among the FlowSchemas that match a given request. The chosen FlowSchema is among those with the numerically lowest (which we take to be logically highest) MatchingPrecedence.  Each MatchingPrecedence value must be ranged in [1,10000]. Note that if the precedence is not specified, it will be set to 1000 as default.")

  public Integer getMatchingPrecedence() {
    return matchingPrecedence;
  }


  public void setMatchingPrecedence(Integer matchingPrecedence) {
    this.matchingPrecedence = matchingPrecedence;
  }


  public V1beta2FlowSchemaSpec priorityLevelConfiguration(V1beta2PriorityLevelConfigurationReference priorityLevelConfiguration) {

    this.priorityLevelConfiguration = priorityLevelConfiguration;
    return this;
  }

   /**
   * Get priorityLevelConfiguration
   * @return priorityLevelConfiguration
  **/
  @ApiModelProperty(required = true, value = "")

  public V1beta2PriorityLevelConfigurationReference getPriorityLevelConfiguration() {
    return priorityLevelConfiguration;
  }


  public void setPriorityLevelConfiguration(V1beta2PriorityLevelConfigurationReference priorityLevelConfiguration) {
    this.priorityLevelConfiguration = priorityLevelConfiguration;
  }


  public V1beta2FlowSchemaSpec rules(List<V1beta2PolicyRulesWithSubjects> rules) {

    this.rules = rules;
    return this;
  }

  public V1beta2FlowSchemaSpec addRulesItem(V1beta2PolicyRulesWithSubjects rulesItem) {
    if (this.rules == null) {
      this.rules = new ArrayList<>();
    }
    this.rules.add(rulesItem);
    return this;
  }

   /**
   * &#x60;rules&#x60; describes which requests will match this flow schema. This FlowSchema matches a request if and only if at least one member of rules matches the request. if it is an empty slice, there will be no requests matching the FlowSchema.
   * @return rules
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "`rules` describes which requests will match this flow schema. This FlowSchema matches a request if and only if at least one member of rules matches the request. if it is an empty slice, there will be no requests matching the FlowSchema.")

  public List<V1beta2PolicyRulesWithSubjects> getRules() {
    return rules;
  }


  public void setRules(List<V1beta2PolicyRulesWithSubjects> rules) {
    this.rules = rules;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1beta2FlowSchemaSpec v1beta2FlowSchemaSpec = (V1beta2FlowSchemaSpec) o;
    return Objects.equals(this.distinguisherMethod, v1beta2FlowSchemaSpec.distinguisherMethod) &&
        Objects.equals(this.matchingPrecedence, v1beta2FlowSchemaSpec.matchingPrecedence) &&
        Objects.equals(this.priorityLevelConfiguration, v1beta2FlowSchemaSpec.priorityLevelConfiguration) &&
        Objects.equals(this.rules, v1beta2FlowSchemaSpec.rules);
  }

  @Override
  public int hashCode() {
    return Objects.hash(distinguisherMethod, matchingPrecedence, priorityLevelConfiguration, rules);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1beta2FlowSchemaSpec {\n");
    sb.append("    distinguisherMethod: ").append(toIndentedString(distinguisherMethod)).append("\n");
    sb.append("    matchingPrecedence: ").append(toIndentedString(matchingPrecedence)).append("\n");
    sb.append("    priorityLevelConfiguration: ").append(toIndentedString(priorityLevelConfiguration)).append("\n");
    sb.append("    rules: ").append(toIndentedString(rules)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}
