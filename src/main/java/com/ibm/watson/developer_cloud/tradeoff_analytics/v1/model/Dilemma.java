/**
 * Copyright 2015 IBM Corp. All Rights Reserved.
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

package com.ibm.watson.developer_cloud.tradeoff_analytics.v1.model;

import com.google.gson.GsonBuilder;


/**
 * The Class Dilemma.
 */
public class Dilemma {

	private Problem problem;
	private Resolution resolution;

	/**
	 * 
	 * @return
	 *     The problem
	 */
	public Problem getProblem() {
		return problem;
	}

	/**
	 * 
	 * @param problem
	 *     The problem
	 */
	public void setProblem(Problem problem) {
		this.problem = problem;
	}

	public Dilemma withProblem(Problem problem) {
		this.problem = problem;
		return this;
	}

	/**
	 * 
	 * @return
	 *     The resolution
	 */
	public Resolution getResolution() {
		return resolution;
	}

	/**
	 * 
	 * @param resolution
	 *     The resolution
	 */
	public void setResolution(Resolution resolution) {
		this.resolution = resolution;
	}

	/**
	 * With resolution.
	 * 
	 * @param resolution
	 *            the resolution
	 * @return the dilemma
	 */
	public Dilemma withResolution(Resolution resolution) {
		this.resolution = resolution;
		return this;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return getClass().getName() + " "
				+ new GsonBuilder().setPrettyPrinting().create().toJson(this);
	}

}