package com.tgtg.componentlibrary.theme;

import android.content.res.Configuration;
import c5.v0;
import com.braze.Constants;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import m3.d3;
import m3.e0;
import m3.i;
import m3.n;
import m3.s;
import m3.u1;
import m3.v1;
import m3.w1;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import x60.b;
import x60.c;
import x60.d;
import x60.e;
import x60.f;
import x60.g;
import x60.k;
import x60.l;
import x60.m;
import xw.a;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\\\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a1\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\b\"\u001d\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\n0\t8\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e\"\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00100\t8\u0006¢\u0006\f\n\u0004\b\u0011\u0010\f\u001a\u0004\b\u0012\u0010\u000e\"\u001d\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00140\t8\u0006¢\u0006\f\n\u0004\b\u0015\u0010\f\u001a\u0004\b\u0016\u0010\u000e\"\u001d\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00180\t8\u0006¢\u0006\f\n\u0004\b\u0019\u0010\f\u001a\u0004\b\u001a\u0010\u000e\"\u001d\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u001c0\t8\u0006¢\u0006\f\n\u0004\b\u001d\u0010\f\u001a\u0004\b\u001e\u0010\u000e\"\u001d\u0010#\u001a\b\u0012\u0004\u0012\u00020 0\t8\u0006¢\u0006\f\n\u0004\b!\u0010\f\u001a\u0004\b\"\u0010\u000e\"\u001d\u0010'\u001a\b\u0012\u0004\u0012\u00020$0\t8\u0006¢\u0006\f\n\u0004\b%\u0010\f\u001a\u0004\b&\u0010\u000e\"\u001d\u0010+\u001a\b\u0012\u0004\u0012\u00020(0\t8\u0006¢\u0006\f\n\u0004\b)\u0010\f\u001a\u0004\b*\u0010\u000e¨\u0006,"}, d2 = {"", "isSystemDarkTheme", "Ljava/util/Locale;", "locale", "Lkotlin/Function0;", "", "content", "PantryTheme", "(ZLjava/util/Locale;Lkotlin/jvm/functions/Function2;Lm3/n;II)V", "Lm3/u1;", "Lx60/a;", Constants.BRAZE_PUSH_CONTENT_KEY, "Lm3/u1;", "getLocalPantryBorder", "()Lm3/u1;", "LocalPantryBorder", "Lx60/h;", "b", "getLocalPantryColor", "LocalPantryColor", "Lx60/k;", "c", "getLocalPantryRadius", "LocalPantryRadius", "Lx60/i;", Constants.BRAZE_PUSH_NOTIFICATION_SOUND_DEFAULT_VALUE, "getLocalPantryShadow", "LocalPantryShadow", "Lx60/n;", "e", "getLocalPantryTransition", "LocalPantryTransition", "Lx60/l;", "f", "getLocalPantrySize", "LocalPantrySize", "Lx60/m;", "g", "getLocalPantrySpacing", "LocalPantrySpacing", "Lx60/j;", "h", "getLocalPantryTypography", "LocalPantryTypography", "app_release"}, k = 2, mv = {2, 3, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nPantryTheme.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PantryTheme.kt\ncom/tgtg/componentlibrary/theme/PantryThemeKt\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n*L\n1#1,83:1\n75#2:84\n*S KotlinDebug\n*F\n+ 1 PantryTheme.kt\ncom/tgtg/componentlibrary/theme/PantryThemeKt\n*L\n56#1:84\n*E\n"})
public final class PantryThemeKt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final e0 f13343a = new e0(new a(6));

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final d3 f13344b = new d3(new a(7));

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final e0 f13345c = new e0(new a(8));

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final d3 f13346d = new d3(new a(9));

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final e0 f13347e = new e0(new a(10));

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final e0 f13348f = new e0(new a(11));

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final e0 f13349g = new e0(new a(12));

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final d3 f13350h = new d3(new a(13));

    public static final void PantryTheme(boolean z11, @Nullable Locale locale, @NotNull Function2<? super n, ? super Integer, Unit> function2, @Nullable n nVar, int i11, int i12) {
        boolean zP;
        int i13;
        Locale locale2;
        function2.getClass();
        s sVar = (s) nVar;
        sVar.c0(673586871);
        if ((i11 & 6) == 0) {
            if ((i12 & 1) == 0) {
                zP = z11;
                int i14 = sVar.g(zP) ? 4 : 2;
                i13 = i14 | i11;
            } else {
                zP = z11;
            }
            i13 = i14 | i11;
        } else {
            zP = z11;
            i13 = i11;
        }
        if ((i11 & 48) == 0) {
            if ((i12 & 2) == 0) {
                locale2 = locale;
                int i15 = sVar.f(locale2) ? 32 : 16;
                i13 |= i15;
            } else {
                locale2 = locale;
            }
            i13 |= i15;
        } else {
            locale2 = locale;
        }
        if ((i11 & MLKEMEngine.KyberPolyBytes) == 0) {
            i13 |= sVar.h(function2) ? 256 : 128;
        }
        if (sVar.R(i13 & 1, (i13 & 147) != 146)) {
            sVar.W();
            if ((i11 & 1) == 0 || sVar.z()) {
                if ((i12 & 1) != 0) {
                    zP = v1.n.p(sVar);
                }
                if ((i12 & 2) != 0) {
                    Locale locale3 = ((Configuration) sVar.j(v0.f7389a)).getLocales().get(0);
                    if (locale3 == null) {
                        locale3 = Locale.getDefault();
                        locale3.getClass();
                    }
                    locale2 = locale3;
                }
            } else {
                sVar.U();
            }
            sVar.r();
            Object obj = zP ? c.f43900v0 : f.f43903v0;
            Object obj2 = zP ? d.f43901c : g.f43904c;
            String language = locale2.getLanguage();
            i.b(new v1[]{f13343a.a(x60.a.f43893f), f13344b.a(obj), f13345c.a(k.f43976m), f13346d.a(obj2), f13347e.a(x60.n.f44022b), f13348f.a(l.f43988q), f13349g.a(m.f44004s), f13350h.a((Intrinsics.areEqual(language, Locale.CHINESE.getLanguage()) || Intrinsics.areEqual(language, Locale.JAPANESE.getLanguage()) || Intrinsics.areEqual(language, Locale.KOREAN.getLanguage())) ? b.f43899z : e.f43902z)}, u3.e.e(1130234743, sVar, new b3.n(20, function2)), sVar, 56);
        } else {
            sVar.U();
        }
        Locale locale4 = locale2;
        w1 w1VarS = sVar.s();
        if (w1VarS != null) {
            w1VarS.f29476d = new cn.d(zP, locale4, function2, i11, i12);
        }
    }

    @NotNull
    public static final u1 getLocalPantryBorder() {
        return f13343a;
    }

    @NotNull
    public static final u1 getLocalPantryColor() {
        return f13344b;
    }

    @NotNull
    public static final u1 getLocalPantryRadius() {
        return f13345c;
    }

    @NotNull
    public static final u1 getLocalPantryShadow() {
        return f13346d;
    }

    @NotNull
    public static final u1 getLocalPantrySize() {
        return f13348f;
    }

    @NotNull
    public static final u1 getLocalPantrySpacing() {
        return f13349g;
    }

    @NotNull
    public static final u1 getLocalPantryTransition() {
        return f13347e;
    }

    @NotNull
    public static final u1 getLocalPantryTypography() {
        return f13350h;
    }
}
