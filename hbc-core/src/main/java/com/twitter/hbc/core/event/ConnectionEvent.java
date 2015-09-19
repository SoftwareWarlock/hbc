/**
 * Copyright 2013 Twitter, Inc.
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * http://www.apache.org/licenses/LICENSE-2.0
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 **/

package com.twitter.hbc.core.event;

import ch.boye.httpclientandroidlib.client.methods.HttpUriRequest;

public class ConnectionEvent extends Event {

  private final HttpUriRequest request;

  public ConnectionEvent(EventType eventType, HttpUriRequest request) {
    super(eventType, request.toString());
    this.request = request;
  }

  public HttpUriRequest getHttpUriRequest() {
    return request;
  }
}
