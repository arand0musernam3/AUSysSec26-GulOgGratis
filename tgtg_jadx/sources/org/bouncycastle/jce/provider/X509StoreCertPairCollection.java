package org.bouncycastle.jce.provider;

import j4.s;
import java.util.Collection;
import org.bouncycastle.util.CollectionStore;
import org.bouncycastle.util.Selector;
import org.bouncycastle.x509.X509CollectionStoreParameters;
import org.bouncycastle.x509.X509StoreParameters;
import org.bouncycastle.x509.X509StoreSpi;

/* JADX INFO: loaded from: classes3.dex */
public class X509StoreCertPairCollection extends X509StoreSpi {
    private CollectionStore _store;

    @Override // org.bouncycastle.x509.X509StoreSpi
    public Collection engineGetMatches(Selector selector) {
        return this._store.getMatches(selector);
    }

    @Override // org.bouncycastle.x509.X509StoreSpi
    public void engineInit(X509StoreParameters x509StoreParameters) {
        if (x509StoreParameters instanceof X509CollectionStoreParameters) {
            this._store = new CollectionStore(((X509CollectionStoreParameters) x509StoreParameters).getCollection());
        } else {
            i4.a.f(s.h(X509CollectionStoreParameters.class, new StringBuilder("Initialization parameters must be an instance of "), "."));
        }
    }
}
