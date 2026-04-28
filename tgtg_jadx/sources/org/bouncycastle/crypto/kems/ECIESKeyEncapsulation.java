package org.bouncycastle.crypto.kems;

import i4.a;
import java.security.SecureRandom;
import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.CryptoServicePurpose;
import org.bouncycastle.crypto.CryptoServicesRegistrar;
import org.bouncycastle.crypto.DerivationFunction;
import org.bouncycastle.crypto.KeyEncapsulation;
import org.bouncycastle.crypto.SecretWithEncapsulation;
import org.bouncycastle.crypto.constraints.ConstraintUtils;
import org.bouncycastle.crypto.constraints.DefaultServiceProperties;
import org.bouncycastle.crypto.params.ECKeyParameters;
import org.bouncycastle.crypto.params.ECPrivateKeyParameters;
import org.bouncycastle.crypto.params.ECPublicKeyParameters;
import org.bouncycastle.crypto.params.KeyParameter;
import org.bouncycastle.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
public class ECIESKeyEncapsulation implements KeyEncapsulation {
    private boolean CofactorMode;
    private boolean OldCofactorMode;
    private boolean SingleHashMode;
    private DerivationFunction kdf;
    private ECKeyParameters key;
    private SecureRandom rnd;

    public ECIESKeyEncapsulation(DerivationFunction derivationFunction, SecureRandom secureRandom, boolean z11, boolean z12, boolean z13) {
        this.kdf = derivationFunction;
        this.rnd = secureRandom;
        this.CofactorMode = z11;
        if (z11) {
            this.OldCofactorMode = false;
        } else {
            this.OldCofactorMode = z12;
        }
        this.SingleHashMode = z13;
    }

    @Override // org.bouncycastle.crypto.KeyEncapsulation
    public CipherParameters decrypt(byte[] bArr, int i11, int i12, int i13) throws IllegalArgumentException {
        ECKeyParameters eCKeyParameters = this.key;
        if (eCKeyParameters instanceof ECPrivateKeyParameters) {
            return new KeyParameter(new ECIESKEMExtractor((ECPrivateKeyParameters) eCKeyParameters, i13, this.kdf, this.CofactorMode, this.OldCofactorMode, this.SingleHashMode).extractSecret(Arrays.copyOfRange(bArr, i11, i12 + i11)));
        }
        a.f("Private key required for encryption");
        return null;
    }

    @Override // org.bouncycastle.crypto.KeyEncapsulation
    public CipherParameters encrypt(byte[] bArr, int i11, int i12) throws IllegalArgumentException {
        if (!(this.key instanceof ECPublicKeyParameters)) {
            a.f("Public key required for encryption");
            return null;
        }
        SecretWithEncapsulation secretWithEncapsulationGenerateEncapsulated = new ECIESKEMGenerator(i12, this.kdf, this.rnd, this.CofactorMode, this.OldCofactorMode, this.SingleHashMode).generateEncapsulated(this.key);
        byte[] encapsulation = secretWithEncapsulationGenerateEncapsulated.getEncapsulation();
        System.arraycopy(encapsulation, 0, bArr, i11, encapsulation.length);
        return new KeyParameter(secretWithEncapsulationGenerateEncapsulated.getSecret());
    }

    @Override // org.bouncycastle.crypto.KeyEncapsulation
    public void init(CipherParameters cipherParameters) throws IllegalArgumentException {
        if (!(cipherParameters instanceof ECKeyParameters)) {
            a.f("EC key required");
            return;
        }
        ECKeyParameters eCKeyParameters = (ECKeyParameters) cipherParameters;
        this.key = eCKeyParameters;
        CryptoServicesRegistrar.checkConstraints(new DefaultServiceProperties("ECIESKem", ConstraintUtils.bitsOfSecurityFor(eCKeyParameters.getParameters().getCurve()), cipherParameters, CryptoServicePurpose.ANY));
    }

    public ECIESKeyEncapsulation(DerivationFunction derivationFunction, SecureRandom secureRandom) {
        this.kdf = derivationFunction;
        this.rnd = secureRandom;
        this.CofactorMode = false;
        this.OldCofactorMode = false;
        this.SingleHashMode = false;
    }

    public CipherParameters decrypt(byte[] bArr, int i11) {
        return decrypt(bArr, 0, bArr.length, i11);
    }

    public CipherParameters encrypt(byte[] bArr, int i11) {
        return encrypt(bArr, 0, i11);
    }
}
