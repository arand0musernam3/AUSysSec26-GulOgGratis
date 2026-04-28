package org.bouncycastle.asn1;

import c50.w;
import java.io.IOException;
import java.util.Enumeration;
import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
class LazyEncodedSequence extends ASN1Sequence {
    private byte[] encoded;

    public LazyEncodedSequence(byte[] bArr) throws IOException {
        if (bArr != null) {
            this.encoded = bArr;
        } else {
            w.l("'encoded' cannot be null");
            throw null;
        }
    }

    private synchronized void force() {
        if (this.encoded != null) {
            ASN1InputStream aSN1InputStream = new ASN1InputStream(this.encoded, true);
            try {
                ASN1EncodableVector vector = aSN1InputStream.readVector();
                aSN1InputStream.close();
                this.elements = vector.takeElements();
                this.encoded = null;
            } catch (IOException e5) {
                throw new ASN1ParsingException("malformed ASN.1: " + e5, e5);
            }
        }
    }

    private synchronized byte[] getContents() {
        return this.encoded;
    }

    @Override // org.bouncycastle.asn1.ASN1Primitive
    public void encode(ASN1OutputStream aSN1OutputStream, boolean z11) throws IOException {
        byte[] contents = getContents();
        if (contents != null) {
            aSN1OutputStream.writeEncodingDL(z11, 48, contents);
        } else {
            super.toDLObject().encode(aSN1OutputStream, z11);
        }
    }

    @Override // org.bouncycastle.asn1.ASN1Primitive
    public int encodedLength(boolean z11) throws IOException {
        byte[] contents = getContents();
        return contents != null ? ASN1OutputStream.getLengthOfEncodingDL(z11, contents.length) : super.toDLObject().encodedLength(z11);
    }

    @Override // org.bouncycastle.asn1.ASN1Sequence
    public ASN1Encodable getObjectAt(int i11) {
        force();
        return super.getObjectAt(i11);
    }

    @Override // org.bouncycastle.asn1.ASN1Sequence
    public Enumeration getObjects() {
        byte[] contents = getContents();
        return contents != null ? new LazyConstructionEnumeration(contents) : super.getObjects();
    }

    @Override // org.bouncycastle.asn1.ASN1Sequence, org.bouncycastle.asn1.ASN1Primitive, org.bouncycastle.asn1.ASN1Object
    public int hashCode() {
        force();
        return super.hashCode();
    }

    @Override // org.bouncycastle.asn1.ASN1Sequence, org.bouncycastle.util.Iterable, java.lang.Iterable
    public Iterator<ASN1Encodable> iterator() {
        force();
        return super.iterator();
    }

    @Override // org.bouncycastle.asn1.ASN1Sequence
    public int size() {
        force();
        return super.size();
    }

    @Override // org.bouncycastle.asn1.ASN1Sequence
    public ASN1BitString toASN1BitString() {
        return ((ASN1Sequence) toDLObject()).toASN1BitString();
    }

    @Override // org.bouncycastle.asn1.ASN1Sequence
    public ASN1External toASN1External() {
        return ((ASN1Sequence) toDLObject()).toASN1External();
    }

    @Override // org.bouncycastle.asn1.ASN1Sequence
    public ASN1OctetString toASN1OctetString() {
        return ((ASN1Sequence) toDLObject()).toASN1OctetString();
    }

    @Override // org.bouncycastle.asn1.ASN1Sequence
    public ASN1Set toASN1Set() {
        return ((ASN1Sequence) toDLObject()).toASN1Set();
    }

    @Override // org.bouncycastle.asn1.ASN1Sequence
    public ASN1Encodable[] toArray() {
        force();
        return super.toArray();
    }

    @Override // org.bouncycastle.asn1.ASN1Sequence
    public ASN1Encodable[] toArrayInternal() {
        force();
        return super.toArrayInternal();
    }

    @Override // org.bouncycastle.asn1.ASN1Sequence, org.bouncycastle.asn1.ASN1Primitive
    public ASN1Primitive toDERObject() {
        force();
        return super.toDERObject();
    }

    @Override // org.bouncycastle.asn1.ASN1Sequence, org.bouncycastle.asn1.ASN1Primitive
    public ASN1Primitive toDLObject() {
        force();
        return super.toDLObject();
    }
}
