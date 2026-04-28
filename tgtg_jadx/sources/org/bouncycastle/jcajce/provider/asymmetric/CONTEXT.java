package org.bouncycastle.jcajce.provider.asymmetric;

import c50.w;
import java.io.IOException;
import java.security.AlgorithmParametersSpi;
import java.security.spec.AlgorithmParameterSpec;
import java.security.spec.InvalidParameterSpecException;
import org.bouncycastle.jcajce.provider.config.ConfigurableProvider;
import org.bouncycastle.jcajce.provider.util.AsymmetricAlgorithmProvider;
import org.bouncycastle.jcajce.spec.ContextParameterSpec;

/* JADX INFO: loaded from: classes3.dex */
public class CONTEXT {
    private static final String PREFIX = "org.bouncycastle.jcajce.provider.asymmetric.CONTEXT$";

    public static class Mappings extends AsymmetricAlgorithmProvider {
        @Override // org.bouncycastle.jcajce.provider.util.AlgorithmProvider
        public void configure(ConfigurableProvider configurableProvider) {
            configurableProvider.addAlgorithm("AlgorithmParameters.CONTEXT", "org.bouncycastle.jcajce.provider.asymmetric.CONTEXT$ContextAlgorithmParametersSpi");
        }
    }

    public static class ContextAlgorithmParametersSpi extends AlgorithmParametersSpi {
        private ContextParameterSpec contextParameterSpec;

        @Override // java.security.AlgorithmParametersSpi
        public byte[] engineGetEncoded() throws IOException {
            throw new IllegalStateException("not implemented");
        }

        @Override // java.security.AlgorithmParametersSpi
        public AlgorithmParameterSpec engineGetParameterSpec(Class cls) throws InvalidParameterSpecException {
            if (cls == null) {
                w.l("argument to getParameterSpec must not be null");
                return null;
            }
            if (cls == ContextParameterSpec.class) {
                return this.contextParameterSpec;
            }
            i4.a.f("argument to getParameterSpec must be ContextParameterSpec.class");
            return null;
        }

        @Override // java.security.AlgorithmParametersSpi
        public void engineInit(AlgorithmParameterSpec algorithmParameterSpec) throws InvalidParameterSpecException {
            if (algorithmParameterSpec instanceof ContextParameterSpec) {
                this.contextParameterSpec = (ContextParameterSpec) algorithmParameterSpec;
            } else {
                i4.a.f("argument to engineInit must be a ContextParameterSpec");
            }
        }

        @Override // java.security.AlgorithmParametersSpi
        public String engineToString() {
            return "ContextParameterSpec";
        }

        public boolean isASN1FormatString(String str) {
            return str == null || str.equals("ASN.1");
        }

        @Override // java.security.AlgorithmParametersSpi
        public byte[] engineGetEncoded(String str) throws IOException {
            throw new IllegalStateException("not implemented");
        }

        @Override // java.security.AlgorithmParametersSpi
        public void engineInit(byte[] bArr) throws IOException {
            throw new IllegalStateException("not implemented");
        }

        @Override // java.security.AlgorithmParametersSpi
        public void engineInit(byte[] bArr, String str) throws IOException {
            throw new IllegalStateException("not implemented");
        }
    }
}
