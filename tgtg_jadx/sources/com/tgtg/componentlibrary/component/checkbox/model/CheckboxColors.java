package com.tgtg.componentlibrary.component.checkbox.model;

import com.braze.Constants;
import e0.f;
import i4.v;
import j4.s;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.bouncycastle.pqc.crypto.newhope.NewHope;
import org.brotli.dec.BrotliInputStream;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import r8.k;
import u70.b0;
import u70.c0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b9\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b&\b\u0087\b\u0018\u00002\u00020\u0001B\u008f\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\u0002\u0012\u0006\u0010\u000b\u001a\u00020\u0002\u0012\u0006\u0010\f\u001a\u00020\u0002\u0012\u0006\u0010\r\u001a\u00020\u0002\u0012\u0006\u0010\u000e\u001a\u00020\u0002\u0012\u0006\u0010\u000f\u001a\u00020\u0002\u0012\u0006\u0010\u0010\u001a\u00020\u0002\u0012\u0006\u0010\u0011\u001a\u00020\u0002\u0012\u0006\u0010\u0012\u001a\u00020\u0002\u0012\u0006\u0010\u0013\u001a\u00020\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0018\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u001a\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u0017J\u0010\u0010\u001c\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u0017J\u0010\u0010\u001e\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u0017J\u0010\u0010 \u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001f\u0010\u0017J\u0010\u0010\"\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b!\u0010\u0017J\u0010\u0010$\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b#\u0010\u0017J\u0010\u0010&\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b%\u0010\u0017J\u0010\u0010(\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b'\u0010\u0017J\u0010\u0010*\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b)\u0010\u0017J\u0010\u0010,\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b+\u0010\u0017J\u0010\u0010.\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b-\u0010\u0017J\u0010\u00100\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b/\u0010\u0017J\u0010\u00102\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b1\u0010\u0017J\u0010\u00104\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b3\u0010\u0017J\u0010\u00106\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b5\u0010\u0017J\u0010\u00108\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b7\u0010\u0017Jº\u0001\u0010;\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\u00022\b\b\u0002\u0010\t\u001a\u00020\u00022\b\b\u0002\u0010\n\u001a\u00020\u00022\b\b\u0002\u0010\u000b\u001a\u00020\u00022\b\b\u0002\u0010\f\u001a\u00020\u00022\b\b\u0002\u0010\r\u001a\u00020\u00022\b\b\u0002\u0010\u000e\u001a\u00020\u00022\b\b\u0002\u0010\u000f\u001a\u00020\u00022\b\b\u0002\u0010\u0010\u001a\u00020\u00022\b\b\u0002\u0010\u0011\u001a\u00020\u00022\b\b\u0002\u0010\u0012\u001a\u00020\u00022\b\b\u0002\u0010\u0013\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b9\u0010:J\u0010\u0010=\u001a\u00020<HÖ\u0001¢\u0006\u0004\b=\u0010>J\u0010\u0010@\u001a\u00020?HÖ\u0001¢\u0006\u0004\b@\u0010AJ\u001a\u0010D\u001a\u00020C2\b\u0010B\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\bD\u0010ER\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bF\u0010G\u001a\u0004\bH\u0010\u0017R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bI\u0010G\u001a\u0004\bJ\u0010\u0017R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bK\u0010G\u001a\u0004\bL\u0010\u0017R\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bM\u0010G\u001a\u0004\bN\u0010\u0017R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bO\u0010G\u001a\u0004\bP\u0010\u0017R\u0017\u0010\b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bQ\u0010G\u001a\u0004\bR\u0010\u0017R\u0017\u0010\t\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bS\u0010G\u001a\u0004\bT\u0010\u0017R\u0017\u0010\n\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bU\u0010G\u001a\u0004\bV\u0010\u0017R\u0017\u0010\u000b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bW\u0010G\u001a\u0004\bX\u0010\u0017R\u0017\u0010\f\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bY\u0010G\u001a\u0004\bZ\u0010\u0017R\u0017\u0010\r\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b[\u0010G\u001a\u0004\b\\\u0010\u0017R\u0017\u0010\u000e\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b]\u0010G\u001a\u0004\b^\u0010\u0017R\u0017\u0010\u000f\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b_\u0010G\u001a\u0004\b`\u0010\u0017R\u0017\u0010\u0010\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\ba\u0010G\u001a\u0004\bb\u0010\u0017R\u0017\u0010\u0011\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bc\u0010G\u001a\u0004\bd\u0010\u0017R\u0017\u0010\u0012\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\be\u0010G\u001a\u0004\bf\u0010\u0017R\u0017\u0010\u0013\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bg\u0010G\u001a\u0004\bh\u0010\u0017¨\u0006i"}, d2 = {"Lcom/tgtg/componentlibrary/component/checkbox/model/CheckboxColors;", "", "Li4/v;", "checkedBoxColor", "indeterminateBoxColor", "uncheckedBoxColor", "enabledIconColor", "disabledIconColor", "focusedRingBorderColor", "disabledCheckedBoxColor", "disabledUncheckedBoxColor", "disabledIndeterminateBoxColor", "enabledCheckedBorderColor", "enabledIndeterminateBorderColor", "enabledUncheckedBorderColor", "disabledCheckedBorderColor", "disabledUncheckedBorderColor", "disabledIndeterminateBorderColor", "disabledCheckedIconColor", "disabledIndeterminateIconColor", "<init>", "(JJJJJJJJJJJJJJJJJLkotlin/jvm/internal/DefaultConstructorMarker;)V", "component1-0d7_KjU", "()J", "component1", "component2-0d7_KjU", "component2", "component3-0d7_KjU", "component3", "component4-0d7_KjU", "component4", "component5-0d7_KjU", "component5", "component6-0d7_KjU", "component6", "component7-0d7_KjU", "component7", "component8-0d7_KjU", "component8", "component9-0d7_KjU", "component9", "component10-0d7_KjU", "component10", "component11-0d7_KjU", "component11", "component12-0d7_KjU", "component12", "component13-0d7_KjU", "component13", "component14-0d7_KjU", "component14", "component15-0d7_KjU", "component15", "component16-0d7_KjU", "component16", "component17-0d7_KjU", "component17", "copy-OG5zQOY", "(JJJJJJJJJJJJJJJJJ)Lcom/tgtg/componentlibrary/component/checkbox/model/CheckboxColors;", "copy", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", Constants.BRAZE_PUSH_CONTENT_KEY, "J", "getCheckedBoxColor-0d7_KjU", "b", "getIndeterminateBoxColor-0d7_KjU", "c", "getUncheckedBoxColor-0d7_KjU", Constants.BRAZE_PUSH_NOTIFICATION_SOUND_DEFAULT_VALUE, "getEnabledIconColor-0d7_KjU", "e", "getDisabledIconColor-0d7_KjU", "f", "getFocusedRingBorderColor-0d7_KjU", "g", "getDisabledCheckedBoxColor-0d7_KjU", "h", "getDisabledUncheckedBoxColor-0d7_KjU", "i", "getDisabledIndeterminateBoxColor-0d7_KjU", "j", "getEnabledCheckedBorderColor-0d7_KjU", "k", "getEnabledIndeterminateBorderColor-0d7_KjU", "l", "getEnabledUncheckedBorderColor-0d7_KjU", "m", "getDisabledCheckedBorderColor-0d7_KjU", Constants.BRAZE_PUSH_CUSTOM_NOTIFICATION_ID, "getDisabledUncheckedBorderColor-0d7_KjU", "o", "getDisabledIndeterminateBorderColor-0d7_KjU", Constants.BRAZE_PUSH_PRIORITY_KEY, "getDisabledCheckedIconColor-0d7_KjU", "q", "getDisabledIndeterminateIconColor-0d7_KjU", "app_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class CheckboxColors {
    public static final int $stable = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    public final long checkedBoxColor;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    public final long indeterminateBoxColor;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    public final long uncheckedBoxColor;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    public final long enabledIconColor;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    public final long disabledIconColor;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    public final long focusedRingBorderColor;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    public final long disabledCheckedBoxColor;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    public final long disabledUncheckedBoxColor;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    public final long disabledIndeterminateBoxColor;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    public final long enabledCheckedBorderColor;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    public final long enabledIndeterminateBorderColor;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    public final long enabledUncheckedBorderColor;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    public final long disabledCheckedBorderColor;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    public final long disabledUncheckedBorderColor;

    /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata */
    public final long disabledIndeterminateBorderColor;

    /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata */
    public final long disabledCheckedIconColor;

    /* JADX INFO: renamed from: q, reason: collision with root package name and from kotlin metadata */
    public final long disabledIndeterminateIconColor;

    public CheckboxColors(long j9, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j21, long j22, long j23, long j24, long j25, long j26, long j27, DefaultConstructorMarker defaultConstructorMarker) {
        this.checkedBoxColor = j9;
        this.indeterminateBoxColor = j11;
        this.uncheckedBoxColor = j12;
        this.enabledIconColor = j13;
        this.disabledIconColor = j14;
        this.focusedRingBorderColor = j15;
        this.disabledCheckedBoxColor = j16;
        this.disabledUncheckedBoxColor = j17;
        this.disabledIndeterminateBoxColor = j18;
        this.enabledCheckedBorderColor = j19;
        this.enabledIndeterminateBorderColor = j21;
        this.enabledUncheckedBorderColor = j22;
        this.disabledCheckedBorderColor = j23;
        this.disabledUncheckedBorderColor = j24;
        this.disabledIndeterminateBorderColor = j25;
        this.disabledCheckedIconColor = j26;
        this.disabledIndeterminateIconColor = j27;
    }

    /* JADX INFO: renamed from: copy-OG5zQOY$default, reason: not valid java name */
    public static /* synthetic */ CheckboxColors m664copyOG5zQOY$default(CheckboxColors checkboxColors, long j9, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j21, long j22, long j23, long j24, long j25, long j26, long j27, int i11, Object obj) {
        long j28;
        long j29;
        long j31;
        long j32;
        long j33;
        long j34;
        long j35;
        long j36;
        long j37;
        long j38;
        long j39;
        long j41;
        long j42;
        long j43;
        long j44;
        long j45;
        CheckboxColors checkboxColors2;
        long j46 = (i11 & 1) != 0 ? checkboxColors.checkedBoxColor : j9;
        long j47 = (i11 & 2) != 0 ? checkboxColors.indeterminateBoxColor : j11;
        long j48 = (i11 & 4) != 0 ? checkboxColors.uncheckedBoxColor : j12;
        long j49 = (i11 & 8) != 0 ? checkboxColors.enabledIconColor : j13;
        long j51 = (i11 & 16) != 0 ? checkboxColors.disabledIconColor : j14;
        long j52 = (i11 & 32) != 0 ? checkboxColors.focusedRingBorderColor : j15;
        long j53 = (i11 & 64) != 0 ? checkboxColors.disabledCheckedBoxColor : j16;
        long j54 = j46;
        long j55 = (i11 & 128) != 0 ? checkboxColors.disabledUncheckedBoxColor : j17;
        long j56 = (i11 & 256) != 0 ? checkboxColors.disabledIndeterminateBoxColor : j18;
        long j57 = (i11 & 512) != 0 ? checkboxColors.enabledCheckedBorderColor : j19;
        long j58 = (i11 & 1024) != 0 ? checkboxColors.enabledIndeterminateBorderColor : j21;
        long j59 = (i11 & NewHope.SENDB_BYTES) != 0 ? checkboxColors.enabledUncheckedBorderColor : j22;
        long j61 = (i11 & 4096) != 0 ? checkboxColors.disabledCheckedBorderColor : j23;
        long j62 = (i11 & 8192) != 0 ? checkboxColors.disabledUncheckedBorderColor : j24;
        long j63 = (i11 & BrotliInputStream.DEFAULT_INTERNAL_BUFFER_SIZE) != 0 ? checkboxColors.disabledIndeterminateBorderColor : j25;
        long j64 = (i11 & 32768) != 0 ? checkboxColors.disabledCheckedIconColor : j26;
        if ((i11 & 65536) != 0) {
            j29 = j64;
            j28 = checkboxColors.disabledIndeterminateIconColor;
            j32 = j57;
            j33 = j58;
            j34 = j59;
            j35 = j61;
            j36 = j62;
            j37 = j63;
            j39 = j48;
            j41 = j49;
            j42 = j51;
            j43 = j52;
            j44 = j53;
            j45 = j55;
            j31 = j56;
            checkboxColors2 = checkboxColors;
            j38 = j47;
        } else {
            j28 = j27;
            j29 = j64;
            j31 = j56;
            j32 = j57;
            j33 = j58;
            j34 = j59;
            j35 = j61;
            j36 = j62;
            j37 = j63;
            j38 = j47;
            j39 = j48;
            j41 = j49;
            j42 = j51;
            j43 = j52;
            j44 = j53;
            j45 = j55;
            checkboxColors2 = checkboxColors;
        }
        return checkboxColors2.m682copyOG5zQOY(j54, j38, j39, j41, j42, j43, j44, j45, j31, j32, j33, j34, j35, j36, j37, j29, j28);
    }

    /* JADX INFO: renamed from: component1-0d7_KjU, reason: not valid java name and from getter */
    public final long getCheckedBoxColor() {
        return this.checkedBoxColor;
    }

    /* JADX INFO: renamed from: component10-0d7_KjU, reason: not valid java name and from getter */
    public final long getEnabledCheckedBorderColor() {
        return this.enabledCheckedBorderColor;
    }

    /* JADX INFO: renamed from: component11-0d7_KjU, reason: not valid java name and from getter */
    public final long getEnabledIndeterminateBorderColor() {
        return this.enabledIndeterminateBorderColor;
    }

    /* JADX INFO: renamed from: component12-0d7_KjU, reason: not valid java name and from getter */
    public final long getEnabledUncheckedBorderColor() {
        return this.enabledUncheckedBorderColor;
    }

    /* JADX INFO: renamed from: component13-0d7_KjU, reason: not valid java name and from getter */
    public final long getDisabledCheckedBorderColor() {
        return this.disabledCheckedBorderColor;
    }

    /* JADX INFO: renamed from: component14-0d7_KjU, reason: not valid java name and from getter */
    public final long getDisabledUncheckedBorderColor() {
        return this.disabledUncheckedBorderColor;
    }

    /* JADX INFO: renamed from: component15-0d7_KjU, reason: not valid java name and from getter */
    public final long getDisabledIndeterminateBorderColor() {
        return this.disabledIndeterminateBorderColor;
    }

    /* JADX INFO: renamed from: component16-0d7_KjU, reason: not valid java name and from getter */
    public final long getDisabledCheckedIconColor() {
        return this.disabledCheckedIconColor;
    }

    /* JADX INFO: renamed from: component17-0d7_KjU, reason: not valid java name and from getter */
    public final long getDisabledIndeterminateIconColor() {
        return this.disabledIndeterminateIconColor;
    }

    /* JADX INFO: renamed from: component2-0d7_KjU, reason: not valid java name and from getter */
    public final long getIndeterminateBoxColor() {
        return this.indeterminateBoxColor;
    }

    /* JADX INFO: renamed from: component3-0d7_KjU, reason: not valid java name and from getter */
    public final long getUncheckedBoxColor() {
        return this.uncheckedBoxColor;
    }

    /* JADX INFO: renamed from: component4-0d7_KjU, reason: not valid java name and from getter */
    public final long getEnabledIconColor() {
        return this.enabledIconColor;
    }

    /* JADX INFO: renamed from: component5-0d7_KjU, reason: not valid java name and from getter */
    public final long getDisabledIconColor() {
        return this.disabledIconColor;
    }

    /* JADX INFO: renamed from: component6-0d7_KjU, reason: not valid java name and from getter */
    public final long getFocusedRingBorderColor() {
        return this.focusedRingBorderColor;
    }

    /* JADX INFO: renamed from: component7-0d7_KjU, reason: not valid java name and from getter */
    public final long getDisabledCheckedBoxColor() {
        return this.disabledCheckedBoxColor;
    }

    /* JADX INFO: renamed from: component8-0d7_KjU, reason: not valid java name and from getter */
    public final long getDisabledUncheckedBoxColor() {
        return this.disabledUncheckedBoxColor;
    }

    /* JADX INFO: renamed from: component9-0d7_KjU, reason: not valid java name and from getter */
    public final long getDisabledIndeterminateBoxColor() {
        return this.disabledIndeterminateBoxColor;
    }

    @NotNull
    /* JADX INFO: renamed from: copy-OG5zQOY, reason: not valid java name */
    public final CheckboxColors m682copyOG5zQOY(long checkedBoxColor, long indeterminateBoxColor, long uncheckedBoxColor, long enabledIconColor, long disabledIconColor, long focusedRingBorderColor, long disabledCheckedBoxColor, long disabledUncheckedBoxColor, long disabledIndeterminateBoxColor, long enabledCheckedBorderColor, long enabledIndeterminateBorderColor, long enabledUncheckedBorderColor, long disabledCheckedBorderColor, long disabledUncheckedBorderColor, long disabledIndeterminateBorderColor, long disabledCheckedIconColor, long disabledIndeterminateIconColor) {
        return new CheckboxColors(checkedBoxColor, indeterminateBoxColor, uncheckedBoxColor, enabledIconColor, disabledIconColor, focusedRingBorderColor, disabledCheckedBoxColor, disabledUncheckedBoxColor, disabledIndeterminateBoxColor, enabledCheckedBorderColor, enabledIndeterminateBorderColor, enabledUncheckedBorderColor, disabledCheckedBorderColor, disabledUncheckedBorderColor, disabledIndeterminateBorderColor, disabledCheckedIconColor, disabledIndeterminateIconColor, null);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CheckboxColors)) {
            return false;
        }
        CheckboxColors checkboxColors = (CheckboxColors) other;
        return v.c(this.checkedBoxColor, checkboxColors.checkedBoxColor) && v.c(this.indeterminateBoxColor, checkboxColors.indeterminateBoxColor) && v.c(this.uncheckedBoxColor, checkboxColors.uncheckedBoxColor) && v.c(this.enabledIconColor, checkboxColors.enabledIconColor) && v.c(this.disabledIconColor, checkboxColors.disabledIconColor) && v.c(this.focusedRingBorderColor, checkboxColors.focusedRingBorderColor) && v.c(this.disabledCheckedBoxColor, checkboxColors.disabledCheckedBoxColor) && v.c(this.disabledUncheckedBoxColor, checkboxColors.disabledUncheckedBoxColor) && v.c(this.disabledIndeterminateBoxColor, checkboxColors.disabledIndeterminateBoxColor) && v.c(this.enabledCheckedBorderColor, checkboxColors.enabledCheckedBorderColor) && v.c(this.enabledIndeterminateBorderColor, checkboxColors.enabledIndeterminateBorderColor) && v.c(this.enabledUncheckedBorderColor, checkboxColors.enabledUncheckedBorderColor) && v.c(this.disabledCheckedBorderColor, checkboxColors.disabledCheckedBorderColor) && v.c(this.disabledUncheckedBorderColor, checkboxColors.disabledUncheckedBorderColor) && v.c(this.disabledIndeterminateBorderColor, checkboxColors.disabledIndeterminateBorderColor) && v.c(this.disabledCheckedIconColor, checkboxColors.disabledCheckedIconColor) && v.c(this.disabledIndeterminateIconColor, checkboxColors.disabledIndeterminateIconColor);
    }

    /* JADX INFO: renamed from: getCheckedBoxColor-0d7_KjU, reason: not valid java name */
    public final long m683getCheckedBoxColor0d7_KjU() {
        return this.checkedBoxColor;
    }

    /* JADX INFO: renamed from: getDisabledCheckedBorderColor-0d7_KjU, reason: not valid java name */
    public final long m684getDisabledCheckedBorderColor0d7_KjU() {
        return this.disabledCheckedBorderColor;
    }

    /* JADX INFO: renamed from: getDisabledCheckedBoxColor-0d7_KjU, reason: not valid java name */
    public final long m685getDisabledCheckedBoxColor0d7_KjU() {
        return this.disabledCheckedBoxColor;
    }

    /* JADX INFO: renamed from: getDisabledCheckedIconColor-0d7_KjU, reason: not valid java name */
    public final long m686getDisabledCheckedIconColor0d7_KjU() {
        return this.disabledCheckedIconColor;
    }

    /* JADX INFO: renamed from: getDisabledIconColor-0d7_KjU, reason: not valid java name */
    public final long m687getDisabledIconColor0d7_KjU() {
        return this.disabledIconColor;
    }

    /* JADX INFO: renamed from: getDisabledIndeterminateBorderColor-0d7_KjU, reason: not valid java name */
    public final long m688getDisabledIndeterminateBorderColor0d7_KjU() {
        return this.disabledIndeterminateBorderColor;
    }

    /* JADX INFO: renamed from: getDisabledIndeterminateBoxColor-0d7_KjU, reason: not valid java name */
    public final long m689getDisabledIndeterminateBoxColor0d7_KjU() {
        return this.disabledIndeterminateBoxColor;
    }

    /* JADX INFO: renamed from: getDisabledIndeterminateIconColor-0d7_KjU, reason: not valid java name */
    public final long m690getDisabledIndeterminateIconColor0d7_KjU() {
        return this.disabledIndeterminateIconColor;
    }

    /* JADX INFO: renamed from: getDisabledUncheckedBorderColor-0d7_KjU, reason: not valid java name */
    public final long m691getDisabledUncheckedBorderColor0d7_KjU() {
        return this.disabledUncheckedBorderColor;
    }

    /* JADX INFO: renamed from: getDisabledUncheckedBoxColor-0d7_KjU, reason: not valid java name */
    public final long m692getDisabledUncheckedBoxColor0d7_KjU() {
        return this.disabledUncheckedBoxColor;
    }

    /* JADX INFO: renamed from: getEnabledCheckedBorderColor-0d7_KjU, reason: not valid java name */
    public final long m693getEnabledCheckedBorderColor0d7_KjU() {
        return this.enabledCheckedBorderColor;
    }

    /* JADX INFO: renamed from: getEnabledIconColor-0d7_KjU, reason: not valid java name */
    public final long m694getEnabledIconColor0d7_KjU() {
        return this.enabledIconColor;
    }

    /* JADX INFO: renamed from: getEnabledIndeterminateBorderColor-0d7_KjU, reason: not valid java name */
    public final long m695getEnabledIndeterminateBorderColor0d7_KjU() {
        return this.enabledIndeterminateBorderColor;
    }

    /* JADX INFO: renamed from: getEnabledUncheckedBorderColor-0d7_KjU, reason: not valid java name */
    public final long m696getEnabledUncheckedBorderColor0d7_KjU() {
        return this.enabledUncheckedBorderColor;
    }

    /* JADX INFO: renamed from: getFocusedRingBorderColor-0d7_KjU, reason: not valid java name */
    public final long m697getFocusedRingBorderColor0d7_KjU() {
        return this.focusedRingBorderColor;
    }

    /* JADX INFO: renamed from: getIndeterminateBoxColor-0d7_KjU, reason: not valid java name */
    public final long m698getIndeterminateBoxColor0d7_KjU() {
        return this.indeterminateBoxColor;
    }

    /* JADX INFO: renamed from: getUncheckedBoxColor-0d7_KjU, reason: not valid java name */
    public final long m699getUncheckedBoxColor0d7_KjU() {
        return this.uncheckedBoxColor;
    }

    public int hashCode() {
        int i11 = v.f23316i;
        b0 b0Var = c0.f40833b;
        return Long.hashCode(this.disabledIndeterminateIconColor) + f.b(f.b(f.b(f.b(f.b(f.b(f.b(f.b(f.b(f.b(f.b(f.b(f.b(f.b(f.b(Long.hashCode(this.checkedBoxColor) * 31, 31, this.indeterminateBoxColor), 31, this.uncheckedBoxColor), 31, this.enabledIconColor), 31, this.disabledIconColor), 31, this.focusedRingBorderColor), 31, this.disabledCheckedBoxColor), 31, this.disabledUncheckedBoxColor), 31, this.disabledIndeterminateBoxColor), 31, this.enabledCheckedBorderColor), 31, this.enabledIndeterminateBorderColor), 31, this.enabledUncheckedBorderColor), 31, this.disabledCheckedBorderColor), 31, this.disabledUncheckedBorderColor), 31, this.disabledIndeterminateBorderColor), 31, this.disabledCheckedIconColor);
    }

    @NotNull
    public String toString() {
        String strI = v.i(this.checkedBoxColor);
        String strI2 = v.i(this.indeterminateBoxColor);
        String strI3 = v.i(this.uncheckedBoxColor);
        String strI4 = v.i(this.enabledIconColor);
        String strI5 = v.i(this.disabledIconColor);
        String strI6 = v.i(this.focusedRingBorderColor);
        String strI7 = v.i(this.disabledCheckedBoxColor);
        String strI8 = v.i(this.disabledUncheckedBoxColor);
        String strI9 = v.i(this.disabledIndeterminateBoxColor);
        String strI10 = v.i(this.enabledCheckedBorderColor);
        String strI11 = v.i(this.enabledIndeterminateBorderColor);
        String strI12 = v.i(this.enabledUncheckedBorderColor);
        String strI13 = v.i(this.disabledCheckedBorderColor);
        String strI14 = v.i(this.disabledUncheckedBorderColor);
        String strI15 = v.i(this.disabledIndeterminateBorderColor);
        String strI16 = v.i(this.disabledCheckedIconColor);
        String strI17 = v.i(this.disabledIndeterminateIconColor);
        StringBuilder sbT = f.t("CheckboxColors(checkedBoxColor=", strI, ", indeterminateBoxColor=", strI2, ", uncheckedBoxColor=");
        s.A(sbT, strI3, ", enabledIconColor=", strI4, ", disabledIconColor=");
        s.A(sbT, strI5, ", focusedRingBorderColor=", strI6, ", disabledCheckedBoxColor=");
        s.A(sbT, strI7, ", disabledUncheckedBoxColor=", strI8, ", disabledIndeterminateBoxColor=");
        s.A(sbT, strI9, ", enabledCheckedBorderColor=", strI10, ", enabledIndeterminateBorderColor=");
        s.A(sbT, strI11, ", enabledUncheckedBorderColor=", strI12, ", disabledCheckedBorderColor=");
        s.A(sbT, strI13, ", disabledUncheckedBorderColor=", strI14, ", disabledIndeterminateBorderColor=");
        s.A(sbT, strI15, ", disabledCheckedIconColor=", strI16, ", disabledIndeterminateIconColor=");
        return k.p(sbT, strI17, ")");
    }
}
