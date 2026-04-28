package org.bouncycastle.jcajce.spec;

import com.braze.h2;
import java.security.spec.AlgorithmParameterSpec;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class CompositeAlgorithmSpec implements AlgorithmParameterSpec {
    private final List<String> algorithmNames;
    private final List<AlgorithmParameterSpec> parameterSpecs;

    public CompositeAlgorithmSpec(Builder builder) {
        this.algorithmNames = Collections.unmodifiableList(new ArrayList(builder.algorithmNames));
        this.parameterSpecs = Collections.unmodifiableList(new ArrayList(builder.parameterSpecs));
    }

    public List<String> getAlgorithmNames() {
        return this.algorithmNames;
    }

    public List<AlgorithmParameterSpec> getParameterSpecs() {
        return this.parameterSpecs;
    }

    public static class Builder {
        private List<String> algorithmNames = new ArrayList();
        private List<AlgorithmParameterSpec> parameterSpecs = new ArrayList();

        public Builder add(String str, AlgorithmParameterSpec algorithmParameterSpec) {
            if (this.algorithmNames.contains(str)) {
                h2.b("cannot build with the same algorithm name added");
                return null;
            }
            this.algorithmNames.add(str);
            this.parameterSpecs.add(algorithmParameterSpec);
            return this;
        }

        public CompositeAlgorithmSpec build() {
            if (!this.algorithmNames.isEmpty()) {
                return new CompositeAlgorithmSpec(this);
            }
            h2.b("cannot call build with no algorithm names added");
            return null;
        }

        public Builder add(String str) {
            return add(str, null);
        }
    }
}
