package org.bouncycastle.asn1;

import i4.a;
import java.io.IOException;

/* JADX INFO: loaded from: classes3.dex */
class DLTaggedObjectParser extends BERTaggedObjectParser {
    private final boolean _constructed;

    public DLTaggedObjectParser(int i11, int i12, boolean z11, ASN1StreamParser aSN1StreamParser) {
        super(i11, i12, aSN1StreamParser);
        this._constructed = z11;
    }

    private ASN1StreamParser checkConstructed() throws IOException {
        if (this._constructed) {
            return this._parser;
        }
        a.k("Explicit tags must be constructed (see X.690 8.14.2)");
        return null;
    }

    @Override // org.bouncycastle.asn1.BERTaggedObjectParser, org.bouncycastle.asn1.InMemoryRepresentable
    public ASN1Primitive getLoadedObject() throws IOException {
        return this._parser.loadTaggedDL(this._tagClass, this._tagNo, this._constructed);
    }

    @Override // org.bouncycastle.asn1.BERTaggedObjectParser, org.bouncycastle.asn1.ASN1TaggedObjectParser
    public ASN1Encodable parseBaseUniversal(boolean z11, int i11) throws IOException {
        if (z11) {
            return checkConstructed().parseObject(i11);
        }
        boolean z12 = this._constructed;
        ASN1StreamParser aSN1StreamParser = this._parser;
        return z12 ? aSN1StreamParser.parseImplicitConstructedDL(i11) : aSN1StreamParser.parseImplicitPrimitive(i11);
    }

    @Override // org.bouncycastle.asn1.BERTaggedObjectParser, org.bouncycastle.asn1.ASN1TaggedObjectParser
    public ASN1Encodable parseExplicitBaseObject() throws IOException {
        return checkConstructed().readObject();
    }

    @Override // org.bouncycastle.asn1.BERTaggedObjectParser, org.bouncycastle.asn1.ASN1TaggedObjectParser
    public ASN1TaggedObjectParser parseExplicitBaseTagged() throws IOException {
        return checkConstructed().parseTaggedObject();
    }

    @Override // org.bouncycastle.asn1.BERTaggedObjectParser, org.bouncycastle.asn1.ASN1TaggedObjectParser
    public ASN1TaggedObjectParser parseImplicitBaseTagged(int i11, int i12) throws IOException {
        return new DLTaggedObjectParser(i11, i12, this._constructed, this._parser);
    }
}
