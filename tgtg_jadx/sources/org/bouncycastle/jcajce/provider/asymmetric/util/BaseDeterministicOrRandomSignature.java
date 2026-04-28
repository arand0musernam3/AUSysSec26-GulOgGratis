package org.bouncycastle.jcajce.provider.asymmetric.util;

import java.security.AlgorithmParameters;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.PrivateKey;
import java.security.ProviderException;
import java.security.PublicKey;
import java.security.SecureRandom;
import java.security.Signature;
import java.security.SignatureException;
import java.security.spec.AlgorithmParameterSpec;
import m0.i1;
import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.params.AsymmetricKeyParameter;
import org.bouncycastle.crypto.params.ParametersWithContext;
import org.bouncycastle.crypto.params.ParametersWithRandom;
import org.bouncycastle.jcajce.spec.ContextParameterSpec;
import org.bouncycastle.jcajce.util.BCJcaJceHelper;
import org.bouncycastle.jcajce.util.JcaJceHelper;
import org.bouncycastle.util.Exceptions;

/* JADX INFO: loaded from: classes3.dex */
public abstract class BaseDeterministicOrRandomSignature extends Signature {
    protected AlgorithmParameters engineParams;
    private final JcaJceHelper helper;
    protected boolean isInitState;
    protected AsymmetricKeyParameter keyParams;
    private final AlgorithmParameterSpec originalSpec;
    protected ContextParameterSpec paramSpec;

    public BaseDeterministicOrRandomSignature(String str) {
        super(str);
        this.helper = new BCJcaJceHelper();
        this.isInitState = true;
        this.originalSpec = ContextParameterSpec.EMPTY_CONTEXT_SPEC;
    }

    private void reInit() {
        boolean z11;
        CipherParameters cipherParameters;
        AsymmetricKeyParameter asymmetricKeyParameter = this.keyParams;
        if (asymmetricKeyParameter.isPrivate()) {
            SecureRandom secureRandom = ((Signature) this).appRandom;
            CipherParameters parametersWithRandom = asymmetricKeyParameter;
            if (secureRandom != null) {
                parametersWithRandom = new ParametersWithRandom(asymmetricKeyParameter, secureRandom);
            }
            ContextParameterSpec contextParameterSpec = this.paramSpec;
            CipherParameters parametersWithContext = parametersWithRandom;
            if (contextParameterSpec != null) {
                parametersWithContext = new ParametersWithContext(parametersWithRandom, contextParameterSpec.getContext());
            }
            z11 = true;
            cipherParameters = parametersWithContext;
        } else {
            ContextParameterSpec contextParameterSpec2 = this.paramSpec;
            CipherParameters parametersWithContext2 = asymmetricKeyParameter;
            if (contextParameterSpec2 != null) {
                parametersWithContext2 = new ParametersWithContext(asymmetricKeyParameter, contextParameterSpec2.getContext());
            }
            z11 = false;
            cipherParameters = parametersWithContext2;
        }
        reInitialize(z11, cipherParameters);
    }

    @Override // java.security.SignatureSpi
    public final Object engineGetParameter(String str) {
        throw new UnsupportedOperationException("GetParameter unsupported");
    }

    @Override // java.security.SignatureSpi
    public final AlgorithmParameters engineGetParameters() {
        ContextParameterSpec contextParameterSpec;
        if (this.engineParams == null && (contextParameterSpec = this.paramSpec) != null && contextParameterSpec != ContextParameterSpec.EMPTY_CONTEXT_SPEC) {
            try {
                AlgorithmParameters algorithmParametersCreateAlgorithmParameters = this.helper.createAlgorithmParameters("CONTEXT");
                this.engineParams = algorithmParametersCreateAlgorithmParameters;
                algorithmParametersCreateAlgorithmParameters.init(this.paramSpec);
            } catch (Exception e5) {
                throw Exceptions.illegalStateException(e5.toString(), e5);
            }
        }
        return this.engineParams;
    }

    @Override // java.security.SignatureSpi
    public final void engineInitSign(PrivateKey privateKey) throws InvalidKeyException {
        signInit(privateKey, null);
        this.paramSpec = ContextParameterSpec.EMPTY_CONTEXT_SPEC;
        this.isInitState = true;
        reInit();
    }

    @Override // java.security.SignatureSpi
    public final void engineInitVerify(PublicKey publicKey) throws InvalidKeyException {
        verifyInit(publicKey);
        this.paramSpec = ContextParameterSpec.EMPTY_CONTEXT_SPEC;
        this.isInitState = true;
        reInit();
    }

    @Override // java.security.SignatureSpi
    public void engineSetParameter(AlgorithmParameterSpec algorithmParameterSpec) throws InvalidAlgorithmParameterException {
        if (algorithmParameterSpec == null && (algorithmParameterSpec = this.originalSpec) == null) {
            return;
        }
        if (!this.isInitState) {
            throw new ProviderException("cannot call setParameter in the middle of update");
        }
        if (!(algorithmParameterSpec instanceof ContextParameterSpec)) {
            i1.v("unknown AlgorithmParameterSpec in signature");
        } else {
            this.paramSpec = (ContextParameterSpec) algorithmParameterSpec;
            reInit();
        }
    }

    @Override // java.security.SignatureSpi
    public final void engineUpdate(byte b8) throws SignatureException {
        this.isInitState = false;
        updateEngine(b8);
    }

    public abstract void reInitialize(boolean z11, CipherParameters cipherParameters);

    public abstract void signInit(PrivateKey privateKey, SecureRandom secureRandom) throws InvalidKeyException;

    public abstract void updateEngine(byte b8) throws SignatureException;

    public abstract void updateEngine(byte[] bArr, int i11, int i12) throws SignatureException;

    public abstract void verifyInit(PublicKey publicKey) throws InvalidKeyException;

    @Override // java.security.SignatureSpi
    public final void engineUpdate(byte[] bArr, int i11, int i12) throws SignatureException {
        this.isInitState = false;
        updateEngine(bArr, i11, i12);
    }

    @Override // java.security.SignatureSpi
    public final void engineInitSign(PrivateKey privateKey, SecureRandom secureRandom) throws InvalidKeyException {
        signInit(privateKey, secureRandom);
        this.paramSpec = ContextParameterSpec.EMPTY_CONTEXT_SPEC;
        this.isInitState = true;
        reInit();
    }

    @Override // java.security.SignatureSpi
    public final void engineSetParameter(String str, Object obj) {
        throw new UnsupportedOperationException("SetParameter unsupported");
    }
}
