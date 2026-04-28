package org.bouncycastle.crypto.constraints;

import i4.a;
import org.bouncycastle.crypto.CryptoServiceProperties;
import org.bouncycastle.crypto.CryptoServicePurpose;

/* JADX INFO: loaded from: classes3.dex */
public class DefaultServiceProperties implements CryptoServiceProperties {
    private final String algorithm;
    private final int bitsOfSecurity;
    private final Object params;
    private final CryptoServicePurpose purpose;

    public DefaultServiceProperties(String str, int i11, Object obj, CryptoServicePurpose cryptoServicePurpose) {
        this.algorithm = str;
        this.bitsOfSecurity = i11;
        this.params = obj;
        if (obj instanceof CryptoServicePurpose) {
            a.f("params should not be CryptoServicePurpose");
            throw null;
        }
        this.purpose = cryptoServicePurpose;
    }

    @Override // org.bouncycastle.crypto.CryptoServiceProperties
    public int bitsOfSecurity() {
        return this.bitsOfSecurity;
    }

    @Override // org.bouncycastle.crypto.CryptoServiceProperties
    public Object getParams() {
        return this.params;
    }

    @Override // org.bouncycastle.crypto.CryptoServiceProperties
    public CryptoServicePurpose getPurpose() {
        return this.purpose;
    }

    @Override // org.bouncycastle.crypto.CryptoServiceProperties
    public String getServiceName() {
        return this.algorithm;
    }

    public DefaultServiceProperties(String str, int i11, Object obj) {
        this(str, i11, obj, CryptoServicePurpose.ANY);
    }

    public DefaultServiceProperties(String str, int i11) {
        this(str, i11, null, CryptoServicePurpose.ANY);
    }
}
