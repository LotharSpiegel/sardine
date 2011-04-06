/*
 * Copyright 2009-2011 Jon Stevens et al.
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

package com.googlecode.sardine.impl;

import com.googlecode.sardine.util.SardineException;
import org.apache.http.client.methods.HttpEntityEnclosingRequestBase;

import java.net.URI;

/**
 * Simple class for making move a bit easier to deal with.
 * @version $Id:$
 */
public class HttpMove extends HttpEntityEnclosingRequestBase
{
	public HttpMove(String sourceUrl, String destinationUrl) throws SardineException
	{
		this.setHeader("Destination", destinationUrl);
		this.setHeader("Overwrite", "T");
		this.setURI(URI.create(sourceUrl));
	}

	@Override
	public String getMethod()
	{
		return "MOVE";
	}
}
