/*
 * Copyright 2012-2017 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"). You may not use this file except in compliance with
 * the License. A copy of the License is located at
 * 
 * http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR
 * CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions
 * and limitations under the License.
 */
package com.amazonaws.services.pinpoint.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.pinpoint.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * APNSVoipSandboxChannelResponse JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class APNSVoipSandboxChannelResponseJsonUnmarshaller implements Unmarshaller<APNSVoipSandboxChannelResponse, JsonUnmarshallerContext> {

    public APNSVoipSandboxChannelResponse unmarshall(JsonUnmarshallerContext context) throws Exception {
        APNSVoipSandboxChannelResponse aPNSVoipSandboxChannelResponse = new APNSVoipSandboxChannelResponse();

        int originalDepth = context.getCurrentDepth();
        String currentParentElement = context.getCurrentParentElement();
        int targetDepth = originalDepth + 1;

        JsonToken token = context.getCurrentToken();
        if (token == null)
            token = context.nextToken();
        if (token == VALUE_NULL) {
            return null;
        }

        while (true) {
            if (token == null)
                break;

            if (token == FIELD_NAME || token == START_OBJECT) {
                if (context.testExpression("ApplicationId", targetDepth)) {
                    context.nextToken();
                    aPNSVoipSandboxChannelResponse.setApplicationId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("CreationDate", targetDepth)) {
                    context.nextToken();
                    aPNSVoipSandboxChannelResponse.setCreationDate(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("DefaultAuthenticationMethod", targetDepth)) {
                    context.nextToken();
                    aPNSVoipSandboxChannelResponse.setDefaultAuthenticationMethod(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Enabled", targetDepth)) {
                    context.nextToken();
                    aPNSVoipSandboxChannelResponse.setEnabled(context.getUnmarshaller(Boolean.class).unmarshall(context));
                }
                if (context.testExpression("HasCredential", targetDepth)) {
                    context.nextToken();
                    aPNSVoipSandboxChannelResponse.setHasCredential(context.getUnmarshaller(Boolean.class).unmarshall(context));
                }
                if (context.testExpression("HasTokenKey", targetDepth)) {
                    context.nextToken();
                    aPNSVoipSandboxChannelResponse.setHasTokenKey(context.getUnmarshaller(Boolean.class).unmarshall(context));
                }
                if (context.testExpression("Id", targetDepth)) {
                    context.nextToken();
                    aPNSVoipSandboxChannelResponse.setId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("IsArchived", targetDepth)) {
                    context.nextToken();
                    aPNSVoipSandboxChannelResponse.setIsArchived(context.getUnmarshaller(Boolean.class).unmarshall(context));
                }
                if (context.testExpression("LastModifiedBy", targetDepth)) {
                    context.nextToken();
                    aPNSVoipSandboxChannelResponse.setLastModifiedBy(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("LastModifiedDate", targetDepth)) {
                    context.nextToken();
                    aPNSVoipSandboxChannelResponse.setLastModifiedDate(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Platform", targetDepth)) {
                    context.nextToken();
                    aPNSVoipSandboxChannelResponse.setPlatform(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Version", targetDepth)) {
                    context.nextToken();
                    aPNSVoipSandboxChannelResponse.setVersion(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return aPNSVoipSandboxChannelResponse;
    }

    private static APNSVoipSandboxChannelResponseJsonUnmarshaller instance;

    public static APNSVoipSandboxChannelResponseJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new APNSVoipSandboxChannelResponseJsonUnmarshaller();
        return instance;
    }
}
