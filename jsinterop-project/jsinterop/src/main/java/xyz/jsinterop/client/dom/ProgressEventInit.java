package xyz.jsinterop.client.dom;

import jsinterop.annotations.JsPackage;

/*
 * #%L
 * jsinterop
 * %%
 * Copyright (C) 2016 Norbert Sándor
 * %%
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/.
 * #L%
 */

import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative = true, namespace = JsPackage.GLOBAL)
public interface ProgressEventInit extends EventInit {
	@JsProperty
	public abstract boolean isLengthComputable();

	@JsProperty
	public abstract void setLengthComputable(final boolean value);

	@JsProperty
	public abstract double getLoaded();

	@JsProperty
	public abstract void setLoaded(final double value);

	@JsProperty
	public abstract double getTotal();

	@JsProperty
	public abstract void setTotal(final double value);
}
