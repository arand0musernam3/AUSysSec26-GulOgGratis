package org.bouncycastle.pqc.asn1;

import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1Integer;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1OctetString;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.DEROctetString;
import org.bouncycastle.asn1.DERSequence;
import org.bouncycastle.pqc.legacy.math.linearalgebra.GF2Matrix;

/* JADX INFO: loaded from: classes3.dex */
public class McEliecePublicKey extends ASN1Object {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final GF2Matrix f33449g;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final int f33450n;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final int f33451t;

    private McEliecePublicKey(ASN1Sequence aSN1Sequence) {
        this.f33450n = ((ASN1Integer) aSN1Sequence.getObjectAt(0)).intValueExact();
        this.f33451t = ((ASN1Integer) aSN1Sequence.getObjectAt(1)).intValueExact();
        this.f33449g = new GF2Matrix(((ASN1OctetString) aSN1Sequence.getObjectAt(2)).getOctets());
    }

    public static McEliecePublicKey getInstance(Object obj) {
        if (obj instanceof McEliecePublicKey) {
            return (McEliecePublicKey) obj;
        }
        if (obj != null) {
            return new McEliecePublicKey(ASN1Sequence.getInstance(obj));
        }
        return null;
    }

    public GF2Matrix getG() {
        return new GF2Matrix(this.f33449g);
    }

    public int getN() {
        return this.f33450n;
    }

    public int getT() {
        return this.f33451t;
    }

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public ASN1Primitive toASN1Primitive() {
        ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector();
        aSN1EncodableVector.add(new ASN1Integer(this.f33450n));
        aSN1EncodableVector.add(new ASN1Integer(this.f33451t));
        aSN1EncodableVector.add(new DEROctetString(this.f33449g.getEncoded()));
        return new DERSequence(aSN1EncodableVector);
    }

    public McEliecePublicKey(int i11, int i12, GF2Matrix gF2Matrix) {
        this.f33450n = i11;
        this.f33451t = i12;
        this.f33449g = new GF2Matrix(gF2Matrix);
    }
}
