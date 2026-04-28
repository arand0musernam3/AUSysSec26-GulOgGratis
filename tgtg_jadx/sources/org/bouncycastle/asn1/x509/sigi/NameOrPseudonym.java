package org.bouncycastle.asn1.x509.sigi;

import e0.f;
import i4.a;
import j4.d;
import j4.s;
import java.util.Enumeration;
import org.bouncycastle.asn1.ASN1Choice;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.ASN1String;
import org.bouncycastle.asn1.DERSequence;
import org.bouncycastle.asn1.x500.DirectoryString;

/* JADX INFO: loaded from: classes3.dex */
public class NameOrPseudonym extends ASN1Object implements ASN1Choice {
    private ASN1Sequence givenName;
    private DirectoryString pseudonym;
    private DirectoryString surname;

    private NameOrPseudonym(ASN1Sequence aSN1Sequence) {
        if (aSN1Sequence.size() != 2) {
            a.f(s.p(aSN1Sequence, new StringBuilder("Bad sequence size: ")));
            throw null;
        }
        if (!(aSN1Sequence.getObjectAt(0) instanceof ASN1String)) {
            d.t(aSN1Sequence.getObjectAt(0).getClass(), "Bad object encountered: ");
            throw null;
        }
        this.surname = DirectoryString.getInstance(aSN1Sequence.getObjectAt(0));
        this.givenName = ASN1Sequence.getInstance(aSN1Sequence.getObjectAt(1));
    }

    public static NameOrPseudonym getInstance(Object obj) {
        if (obj == null || (obj instanceof NameOrPseudonym)) {
            return (NameOrPseudonym) obj;
        }
        if (obj instanceof ASN1String) {
            return new NameOrPseudonym(DirectoryString.getInstance(obj));
        }
        if (obj instanceof ASN1Sequence) {
            return new NameOrPseudonym((ASN1Sequence) obj);
        }
        a.f(f.j(obj, "illegal object in getInstance: "));
        return null;
    }

    public DirectoryString[] getGivenName() {
        DirectoryString[] directoryStringArr = new DirectoryString[this.givenName.size()];
        Enumeration objects = this.givenName.getObjects();
        int i11 = 0;
        while (objects.hasMoreElements()) {
            directoryStringArr[i11] = DirectoryString.getInstance(objects.nextElement());
            i11++;
        }
        return directoryStringArr;
    }

    public DirectoryString getPseudonym() {
        return this.pseudonym;
    }

    public DirectoryString getSurname() {
        return this.surname;
    }

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public ASN1Primitive toASN1Primitive() {
        DirectoryString directoryString = this.pseudonym;
        return directoryString != null ? directoryString.toASN1Primitive() : new DERSequence(this.surname, this.givenName);
    }

    public NameOrPseudonym(String str) {
        this(new DirectoryString(str));
    }

    public NameOrPseudonym(DirectoryString directoryString) {
        this.pseudonym = directoryString;
    }

    public NameOrPseudonym(DirectoryString directoryString, ASN1Sequence aSN1Sequence) {
        this.surname = directoryString;
        this.givenName = aSN1Sequence;
    }
}
