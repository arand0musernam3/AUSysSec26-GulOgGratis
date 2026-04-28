package org.bouncycastle.asn1.x509;

import e0.f;
import i4.a;
import j4.d;
import org.bouncycastle.asn1.ASN1Choice;
import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Set;
import org.bouncycastle.asn1.ASN1TaggedObject;
import org.bouncycastle.asn1.ASN1Util;
import org.bouncycastle.asn1.DERTaggedObject;
import org.bouncycastle.util.Strings;

/* JADX INFO: loaded from: classes3.dex */
public class DistributionPointName extends ASN1Object implements ASN1Choice {
    public static final int FULL_NAME = 0;
    public static final int NAME_RELATIVE_TO_CRL_ISSUER = 1;
    private final ASN1Encodable name;
    private final int type;

    public DistributionPointName(ASN1TaggedObject aSN1TaggedObject) {
        ASN1Encodable aSN1Set;
        this.type = aSN1TaggedObject.getTagNo();
        if (aSN1TaggedObject.hasContextTag(0)) {
            aSN1Set = GeneralNames.getInstance(aSN1TaggedObject, false);
        } else {
            if (!aSN1TaggedObject.hasContextTag(1)) {
                d.t(ASN1Util.getTagText(aSN1TaggedObject), "unknown tag: ");
                throw null;
            }
            aSN1Set = ASN1Set.getInstance(aSN1TaggedObject, false);
        }
        this.name = aSN1Set;
    }

    private void appendObject(StringBuffer stringBuffer, String str, String str2, String str3) {
        stringBuffer.append("    ");
        stringBuffer.append(str2);
        stringBuffer.append(":");
        stringBuffer.append(str);
        stringBuffer.append("    ");
        stringBuffer.append("    ");
        stringBuffer.append(str3);
        stringBuffer.append(str);
    }

    public static DistributionPointName getInstance(Object obj) {
        if (obj == null || (obj instanceof DistributionPointName)) {
            return (DistributionPointName) obj;
        }
        if (obj instanceof ASN1TaggedObject) {
            return new DistributionPointName((ASN1TaggedObject) obj);
        }
        a.f(f.j(obj, "unknown object in factory: "));
        return null;
    }

    public static DistributionPointName getTagged(ASN1TaggedObject aSN1TaggedObject, boolean z11) {
        return getInstance(ASN1Util.getTaggedChoiceBaseObject(aSN1TaggedObject, z11, "DistributionPointName"));
    }

    public ASN1Encodable getName() {
        return this.name;
    }

    public int getType() {
        return this.type;
    }

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public ASN1Primitive toASN1Primitive() {
        return new DERTaggedObject(false, this.type, this.name);
    }

    public String toString() {
        String strLineSeparator = Strings.lineSeparator();
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("DistributionPointName: [");
        stringBuffer.append(strLineSeparator);
        appendObject(stringBuffer, strLineSeparator, this.type == 0 ? "fullName" : "nameRelativeToCRLIssuer", this.name.toString());
        stringBuffer.append("]");
        stringBuffer.append(strLineSeparator);
        return stringBuffer.toString();
    }

    public static DistributionPointName getInstance(ASN1TaggedObject aSN1TaggedObject, boolean z11) {
        return getInstance(ASN1Util.getInstanceChoiceBaseObject(aSN1TaggedObject, z11, "DistributionPointName"));
    }

    public DistributionPointName(int i11, ASN1Encodable aSN1Encodable) {
        this.type = i11;
        this.name = aSN1Encodable;
    }

    public DistributionPointName(GeneralNames generalNames) {
        this(0, generalNames);
    }
}
