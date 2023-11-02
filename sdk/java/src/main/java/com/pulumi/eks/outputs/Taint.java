// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.eks.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class Taint {
    /**
     * @return The effect of the taint.
     * 
     */
    private String effect;
    /**
     * @return The value of the taint.
     * 
     */
    private String value;

    private Taint() {}
    /**
     * @return The effect of the taint.
     * 
     */
    public String effect() {
        return this.effect;
    }
    /**
     * @return The value of the taint.
     * 
     */
    public String value() {
        return this.value;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(Taint defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String effect;
        private String value;
        public Builder() {}
        public Builder(Taint defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.effect = defaults.effect;
    	      this.value = defaults.value;
        }

        @CustomType.Setter
        public Builder effect(String effect) {
            this.effect = Objects.requireNonNull(effect);
            return this;
        }
        @CustomType.Setter
        public Builder value(String value) {
            this.value = Objects.requireNonNull(value);
            return this;
        }
        public Taint build() {
            final var _resultValue = new Taint();
            _resultValue.effect = effect;
            _resultValue.value = value;
            return _resultValue;
        }
    }
}
