package org.bouncycastle.asn1.ocsp;

import e0.f;
import i4.a;
import j4.d;
import org.bouncycastle.asn1.ASN1Choice;
import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1Null;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1TaggedObject;
import org.bouncycastle.asn1.ASN1Util;
import org.bouncycastle.asn1.DERNull;
import org.bouncycastle.asn1.DERTaggedObject;

/* JADX INFO: loaded from: classes3.dex */
public class CertStatus extends ASN1Object implements ASN1Choice {
    private int tagNo;
    private ASN1Encodable value;

    private CertStatus(ASN1TaggedObject aSN1TaggedObject) {
        ASN1Encodable aSN1Null;
        int tagNo = aSN1TaggedObject.getTagNo();
        if (tagNo == 0) {
            aSN1Null = ASN1Null.getInstance(aSN1TaggedObject, false);
        } else if (tagNo != 1) {
            if (tagNo != 2) {
                d.t(ASN1Util.getTagText(aSN1TaggedObject), "Unknown tag encountered: ");
                throw null;
            }
            aSN1Null = ASN1Null.getInstance(aSN1TaggedObject, false);
        } else {
            aSN1Null = RevokedInfo.getInstance(aSN1TaggedObject, false);
        }
        this.value = aSN1Null;
        this.tagNo = tagNo;
    }

    public static CertStatus getInstance(Object obj) {
        if (obj == null || (obj instanceof CertStatus)) {
            return (CertStatus) obj;
        }
        if (obj instanceof ASN1TaggedObject) {
            return new CertStatus((ASN1TaggedObject) obj);
        }
        a.f(f.j(obj, "unknown object in factory: "));
        return null;
    }

    public ASN1Encodable getStatus() {
        return this.value;
    }

    public int getTagNo() {
        return this.tagNo;
    }

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public ASN1Primitive toASN1Primitive() {
        return new DERTaggedObject(false, this.tagNo, this.value);
    }

    public static CertStatus getInstance(ASN1TaggedObject aSN1TaggedObject, boolean z11) {
        return getInstance(aSN1TaggedObject.getExplicitBaseTagged());
    }

    public CertStatus(int i11, ASN1Encodable aSN1Encodable) {
        this.tagNo = i11;
        this.value = aSN1Encodable;
    }

    public CertStatus() {
        this.tagNo = 0;
        this.value = DERNull.INSTANCE;
    }

    public CertStatus(RevokedInfo revokedInfo) {
        this.tagNo = 1;
        this.value = revokedInfo;
    }
}
