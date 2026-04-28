package org.bouncycastle.jcajce.provider.asymmetric.mldsa;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import org.bouncycastle.asn1.ASN1Set;
import org.bouncycastle.asn1.pkcs.PrivateKeyInfo;
import org.bouncycastle.jcajce.interfaces.MLDSAPrivateKey;
import org.bouncycastle.jcajce.interfaces.MLDSAPublicKey;
import org.bouncycastle.jcajce.spec.MLDSAParameterSpec;
import org.bouncycastle.pqc.crypto.mldsa.MLDSAPrivateKeyParameters;
import org.bouncycastle.pqc.crypto.mldsa.MLDSAPublicKeyParameters;
import org.bouncycastle.pqc.crypto.util.PrivateKeyFactory;
import org.bouncycastle.pqc.jcajce.provider.util.KeyUtil;
import org.bouncycastle.util.Arrays;
import org.bouncycastle.util.Fingerprint;
import org.bouncycastle.util.Strings;
import org.bouncycastle.util.encoders.Hex;

/* JADX INFO: loaded from: classes3.dex */
public class BCMLDSAPrivateKey implements MLDSAPrivateKey {
    private static final long serialVersionUID = 1;
    private transient String algorithm;
    private transient ASN1Set attributes;
    private transient byte[] encoding;
    private transient MLDSAPrivateKeyParameters params;

    public BCMLDSAPrivateKey(MLDSAPrivateKeyParameters mLDSAPrivateKeyParameters) {
        this.params = mLDSAPrivateKeyParameters;
        this.algorithm = Strings.toUpperCase(MLDSAParameterSpec.fromName(mLDSAPrivateKeyParameters.getParameters().getName()).getName());
    }

    private void init(MLDSAPrivateKeyParameters mLDSAPrivateKeyParameters, ASN1Set aSN1Set) {
        this.attributes = aSN1Set;
        this.params = mLDSAPrivateKeyParameters;
        this.algorithm = Strings.toUpperCase(MLDSAParameterSpec.fromName(mLDSAPrivateKeyParameters.getParameters().getName()).getName());
    }

    private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        objectInputStream.defaultReadObject();
        init(PrivateKeyInfo.getInstance((byte[]) objectInputStream.readObject()));
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeObject(getEncoded());
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof BCMLDSAPrivateKey) {
            return Arrays.areEqual(this.params.getEncoded(), ((BCMLDSAPrivateKey) obj).params.getEncoded());
        }
        return false;
    }

    @Override // java.security.Key
    public final String getAlgorithm() {
        return this.algorithm;
    }

    @Override // java.security.Key
    public byte[] getEncoded() {
        if (this.encoding == null) {
            this.encoding = KeyUtil.getEncodedPrivateKeyInfo(this.params, this.attributes);
        }
        return Arrays.clone(this.encoding);
    }

    @Override // java.security.Key
    public String getFormat() {
        return "PKCS#8";
    }

    public MLDSAPrivateKeyParameters getKeyParams() {
        return this.params;
    }

    @Override // org.bouncycastle.jcajce.interfaces.MLDSAKey
    public MLDSAParameterSpec getParameterSpec() {
        return MLDSAParameterSpec.fromName(this.params.getParameters().getName());
    }

    @Override // org.bouncycastle.jcajce.interfaces.MLDSAPrivateKey
    public byte[] getPrivateData() {
        return this.params.getEncoded();
    }

    @Override // org.bouncycastle.jcajce.interfaces.MLDSAPrivateKey
    public MLDSAPrivateKey getPrivateKey(boolean z11) {
        return (!z11 || this.params.getSeed() == null) ? new BCMLDSAPrivateKey(this.params.getParametersWithFormat(2)) : new BCMLDSAPrivateKey(this.params.getParametersWithFormat(1));
    }

    @Override // org.bouncycastle.jcajce.interfaces.MLDSAPrivateKey
    public MLDSAPublicKey getPublicKey() {
        MLDSAPublicKeyParameters publicKeyParameters = this.params.getPublicKeyParameters();
        if (publicKeyParameters == null) {
            return null;
        }
        return new BCMLDSAPublicKey(publicKeyParameters);
    }

    @Override // org.bouncycastle.jcajce.interfaces.MLDSAPrivateKey
    public byte[] getSeed() {
        return this.params.getSeed();
    }

    public int hashCode() {
        return Arrays.hashCode(this.params.getEncoded());
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        String strLineSeparator = Strings.lineSeparator();
        byte[] publicKey = this.params.getPublicKey();
        sb2.append(getAlgorithm());
        sb2.append(" Private Key [");
        sb2.append(new Fingerprint(publicKey).toString());
        sb2.append("]");
        sb2.append(strLineSeparator);
        sb2.append("    public data: ");
        sb2.append(Hex.toHexString(publicKey));
        sb2.append(strLineSeparator);
        return sb2.toString();
    }

    private void init(PrivateKeyInfo privateKeyInfo) throws IOException {
        this.encoding = privateKeyInfo.getEncoded();
        init((MLDSAPrivateKeyParameters) PrivateKeyFactory.createKey(privateKeyInfo), privateKeyInfo.getAttributes());
    }

    public BCMLDSAPrivateKey(PrivateKeyInfo privateKeyInfo) throws IOException {
        init(privateKeyInfo);
    }
}
