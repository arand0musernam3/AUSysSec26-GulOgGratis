package com.tgtg.componentlibrary.theme.demo.ext;

import i4.g0;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.StringCompanionObject;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\u001a\u0013\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Li4/v;", "", "argbToHex-8_81llA", "(J)Ljava/lang/String;", "argbToHex", "app_release"}, k = 2, mv = {2, 3, 0}, xi = 48)
public final class ColorExtKt {
    @NotNull
    /* JADX INFO: renamed from: argbToHex-8_81llA, reason: not valid java name */
    public static final String m959argbToHex8_81llA(long j9) {
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        return String.format("#%08X", Arrays.copyOf(new Object[]{Integer.valueOf(g0.C(j9))}, 1));
    }
}
