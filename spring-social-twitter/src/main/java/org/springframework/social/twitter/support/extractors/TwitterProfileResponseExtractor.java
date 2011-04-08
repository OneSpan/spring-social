/*
 * Copyright 2011 the original author or authors.
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
package org.springframework.social.twitter.support.extractors;

import java.util.Map;

import org.springframework.social.twitter.types.TwitterProfile;

public class TwitterProfileResponseExtractor extends AbstractResponseExtractor<TwitterProfile> {

	public TwitterProfile extractObject(Map<String, Object> response) {
		TwitterProfile profile = new TwitterProfile();
		profile.setId(Long.valueOf(String.valueOf(response.get("id"))).longValue());
		profile.setScreenName(String.valueOf(response.get("screen_name")));
		profile.setName(String.valueOf(response.get("name")));
		profile.setDescription(String.valueOf(response.get("description")));
		profile.setLocation(String.valueOf(response.get("location")));
		profile.setUrl(String.valueOf(response.get("url")));
		profile.setProfileImageUrl(String.valueOf(response.get("profile_image_url")));
		profile.setCreatedDate(toTimelineDate(String.valueOf(response.get("created_at"))));
		return profile;
	}

}
