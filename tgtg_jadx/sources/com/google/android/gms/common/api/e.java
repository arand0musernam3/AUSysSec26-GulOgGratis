package com.google.android.gms.common.api;

import androidx.annotation.NonNull;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class e {
    public static final int API_PRIORITY_GAMES = 1;
    public static final int API_PRIORITY_OTHER = Integer.MAX_VALUE;
    public static final int API_PRIORITY_PLUS = 2;

    @NonNull
    public List<Scope> getImpliedScopes(Object obj) {
        return Collections.EMPTY_LIST;
    }

    public int getPriority() {
        return Integer.MAX_VALUE;
    }
}
