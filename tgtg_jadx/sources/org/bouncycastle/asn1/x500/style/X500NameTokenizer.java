package org.bouncycastle.asn1.x500.style;

import i4.a;

/* JADX INFO: loaded from: classes3.dex */
public class X500NameTokenizer {
    private int index;
    private final char separator;
    private final String value;

    public X500NameTokenizer(String str, char c3) {
        str.getClass();
        if (c3 == '\"' || c3 == '\\') {
            a.f("reserved separator character");
            throw null;
        }
        this.value = str;
        this.separator = c3;
        this.index = str.length() < 1 ? 0 : -1;
    }

    public boolean hasMoreTokens() {
        return this.index < this.value.length();
    }

    public String nextToken() {
        if (this.index >= this.value.length()) {
            return null;
        }
        int i11 = this.index + 1;
        boolean z11 = false;
        boolean z12 = false;
        while (true) {
            int i12 = this.index + 1;
            this.index = i12;
            if (i12 >= this.value.length()) {
                if (!z11 && !z12) {
                    return this.value.substring(i11, this.index);
                }
                a.f("badly formatted directory string");
                return null;
            }
            char cCharAt = this.value.charAt(this.index);
            if (z11) {
                z11 = false;
            } else if (cCharAt == '\"') {
                z12 = !z12;
            } else if (z12) {
                continue;
            } else if (cCharAt == '\\') {
                z11 = true;
            } else if (cCharAt == this.separator) {
                return this.value.substring(i11, this.index);
            }
        }
    }

    public X500NameTokenizer(String str) {
        this(str, ',');
    }
}
