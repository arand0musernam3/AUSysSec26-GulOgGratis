package org.bouncycastle.asn1;

import b3.i;
import java.io.IOException;
import java.util.Enumeration;
import m0.i1;

/* JADX INFO: loaded from: classes3.dex */
class LazyConstructionEnumeration implements Enumeration {
    private ASN1InputStream aIn;
    private Object nextObj = readObject();

    public LazyConstructionEnumeration(byte[] bArr) {
        this.aIn = new ASN1InputStream(bArr, true);
    }

    private Object readObject() {
        try {
            return this.aIn.readObject();
        } catch (IOException e5) {
            throw new ASN1ParsingException(i.k("malformed ASN.1: ", e5), e5);
        }
    }

    @Override // java.util.Enumeration
    public boolean hasMoreElements() {
        return this.nextObj != null;
    }

    @Override // java.util.Enumeration
    public Object nextElement() {
        Object obj = this.nextObj;
        if (obj != null) {
            this.nextObj = readObject();
            return obj;
        }
        i1.c();
        return null;
    }
}
