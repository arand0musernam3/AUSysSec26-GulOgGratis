package org.bouncycastle.jcajce;

import com.braze.h2;
import i4.a;
import j4.s;
import java.io.IOException;
import java.security.PrivateKey;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1Encoding;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.DERSequence;
import org.bouncycastle.asn1.pkcs.PrivateKeyInfo;
import org.bouncycastle.asn1.x509.AlgorithmIdentifier;
import org.bouncycastle.internal.asn1.misc.MiscObjectIdentifiers;
import org.bouncycastle.jcajce.provider.asymmetric.compositesignatures.CompositeIndex;
import org.bouncycastle.jcajce.provider.asymmetric.compositesignatures.KeyFactorySpi;
import org.bouncycastle.util.Arrays;
import org.bouncycastle.util.Exceptions;

/* JADX INFO: loaded from: classes3.dex */
public class CompositePrivateKey implements PrivateKey {
    private ASN1ObjectIdentifier algorithmIdentifier;
    private final List<PrivateKey> keys;

    public CompositePrivateKey(PrivateKeyInfo privateKeyInfo) {
        try {
            if (!CompositeIndex.isAlgorithmSupported(privateKeyInfo.getPrivateKeyAlgorithm().getAlgorithm())) {
                throw new IllegalStateException("Unable to create CompositePrivateKey from PrivateKeyInfo");
            }
            CompositePrivateKey compositePrivateKey = (CompositePrivateKey) new KeyFactorySpi().generatePrivate(privateKeyInfo);
            if (compositePrivateKey == null) {
                throw new IllegalStateException("Unable to create CompositePrivateKey from PrivateKeyInfo");
            }
            this.keys = compositePrivateKey.getPrivateKeys();
            this.algorithmIdentifier = compositePrivateKey.getAlgorithmIdentifier();
        } catch (IOException e5) {
            throw Exceptions.illegalStateException(e5.getMessage(), e5);
        }
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof CompositePrivateKey) {
            CompositePrivateKey compositePrivateKey = (CompositePrivateKey) obj;
            if (compositePrivateKey.getAlgorithmIdentifier().equals((ASN1Primitive) this.algorithmIdentifier) && this.keys.equals(compositePrivateKey.keys)) {
                return true;
            }
        }
        return false;
    }

    @Override // java.security.Key
    public String getAlgorithm() {
        return CompositeIndex.getAlgorithmName(this.algorithmIdentifier);
    }

    public ASN1ObjectIdentifier getAlgorithmIdentifier() {
        return this.algorithmIdentifier;
    }

    @Override // java.security.Key
    public byte[] getEncoded() {
        StringBuilder sb2;
        ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector();
        int i11 = 0;
        if (this.algorithmIdentifier.equals((ASN1Primitive) MiscObjectIdentifiers.id_composite_key)) {
            while (i11 < this.keys.size()) {
                aSN1EncodableVector.add(PrivateKeyInfo.getInstance(this.keys.get(i11).getEncoded()));
                i11++;
            }
            try {
                return new PrivateKeyInfo(new AlgorithmIdentifier(this.algorithmIdentifier), new DERSequence(aSN1EncodableVector)).getEncoded(ASN1Encoding.DER);
            } catch (IOException e5) {
                e = e5;
                sb2 = new StringBuilder("unable to encode composite private key: ");
            }
        } else {
            byte[] bArrConcatenate = null;
            while (i11 < this.keys.size()) {
                bArrConcatenate = Arrays.concatenate(bArrConcatenate, PrivateKeyInfo.getInstance(this.keys.get(i11).getEncoded()).getPrivateKey().getOctets());
                i11++;
            }
            try {
                return new PrivateKeyInfo(new AlgorithmIdentifier(this.algorithmIdentifier), bArrConcatenate).getEncoded(ASN1Encoding.DER);
            } catch (IOException e11) {
                e = e11;
                sb2 = new StringBuilder("unable to encode composite private key: ");
            }
        }
        h2.b(s.g(e, sb2));
        return null;
    }

    @Override // java.security.Key
    public String getFormat() {
        return "PKCS#8";
    }

    public List<PrivateKey> getPrivateKeys() {
        return this.keys;
    }

    public int hashCode() {
        return this.keys.hashCode();
    }

    public CompositePrivateKey(ASN1ObjectIdentifier aSN1ObjectIdentifier, PrivateKey... privateKeyArr) {
        this.algorithmIdentifier = aSN1ObjectIdentifier;
        if (privateKeyArr == null || privateKeyArr.length == 0) {
            a.f("at least one private key must be provided for the composite private key");
            throw null;
        }
        ArrayList arrayList = new ArrayList(privateKeyArr.length);
        for (PrivateKey privateKey : privateKeyArr) {
            arrayList.add(privateKey);
        }
        this.keys = Collections.unmodifiableList(arrayList);
    }

    public CompositePrivateKey(PrivateKey... privateKeyArr) {
        this(MiscObjectIdentifiers.id_composite_key, privateKeyArr);
    }
}
