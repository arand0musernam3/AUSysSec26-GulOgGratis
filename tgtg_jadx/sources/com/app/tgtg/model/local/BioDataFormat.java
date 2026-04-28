package com.app.tgtg.model.local;

import android.util.Base64;
import j4.s;
import java.util.List;
import kotlin.Metadata;
import kotlin.text.StringsKt;
import kotlin.text.StringsKt__StringsKt;
import kotlin.text.y;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\bJ\u0010\u0010\n\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\f\u001a\u00020\u0005R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lcom/app/tgtg/model/local/BioDataFormat;", "", "<init>", "()V", "PREFIX", "", "encodeAes", "iv", "", "ciphertext", "tryParseAes", "Lcom/app/tgtg/model/local/AesParts;", "secret", "app"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class BioDataFormat {
    public static final int $stable = 0;

    @NotNull
    public static final BioDataFormat INSTANCE = new BioDataFormat();

    @NotNull
    private static final String PREFIX = "AESGCM1:";

    private BioDataFormat() {
    }

    @NotNull
    public final String encodeAes(@NotNull byte[] iv2, @NotNull byte[] ciphertext) {
        iv2.getClass();
        ciphertext.getClass();
        return s.k(PREFIX, Base64.encodeToString(iv2, 2), ":", Base64.encodeToString(ciphertext, 2));
    }

    @Nullable
    public final AesParts tryParseAes(@NotNull String secret) {
        secret.getClass();
        if (!y.p(secret, PREFIX, false)) {
            return null;
        }
        List listSplit$default = StringsKt__StringsKt.split$default(StringsKt.N(secret, PREFIX), new String[]{":"}, false, 0, 6, null);
        if (listSplit$default.size() != 2) {
            return null;
        }
        try {
            byte[] bArrDecode = Base64.decode((String) listSplit$default.get(0), 2);
            byte[] bArrDecode2 = Base64.decode((String) listSplit$default.get(1), 2);
            bArrDecode.getClass();
            bArrDecode2.getClass();
            return new AesParts(bArrDecode, bArrDecode2);
        } catch (IllegalArgumentException unused) {
            return null;
        }
    }
}
