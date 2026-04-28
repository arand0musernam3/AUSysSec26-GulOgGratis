package org.bouncycastle.x509;

import c50.w;
import java.util.ArrayList;
import java.util.Collection;

/* JADX INFO: loaded from: classes3.dex */
public class X509CollectionStoreParameters implements X509StoreParameters {
    private Collection collection;

    public X509CollectionStoreParameters(Collection collection) {
        if (collection != null) {
            this.collection = collection;
        } else {
            w.l("collection cannot be null");
            throw null;
        }
    }

    public Object clone() {
        return new X509CollectionStoreParameters(this.collection);
    }

    public Collection getCollection() {
        return new ArrayList(this.collection);
    }

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer("X509CollectionStoreParameters: [\n");
        stringBuffer.append("  collection: " + this.collection + "\n");
        stringBuffer.append("]");
        return stringBuffer.toString();
    }
}
