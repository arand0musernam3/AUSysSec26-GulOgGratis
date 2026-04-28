package com.app.tgtg.model.local;

import com.braze.models.inappmessage.InAppMessageBase;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import lv.s;
import org.bouncycastle.i18n.TextBundle;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0018\b\u0007\u0018\u00002\u00020\u0001B;\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nR$\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u000b\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\"\u0010\u0004\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0004\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R$\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010\u000b\u001a\u0004\b\u0015\u0010\r\"\u0004\b\u0016\u0010\u000fR\"\u0010\u0007\u001a\u00020\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0007\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\"\u0010\b\u001a\u00020\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\b\u0010\u0017\u001a\u0004\b\u001c\u0010\u0019\"\u0004\b\u001d\u0010\u001b¨\u0006\u001e"}, d2 = {"Lcom/app/tgtg/model/local/SnackBarInfo;", "", "", InAppMessageBase.ICON, TextBundle.TEXT_ENTRY, "voiceOverText", "Li4/v;", "background", "textColor", "<init>", "(Ljava/lang/Integer;ILjava/lang/Integer;JJLkotlin/jvm/internal/DefaultConstructorMarker;)V", "Ljava/lang/Integer;", "getIcon", "()Ljava/lang/Integer;", "setIcon", "(Ljava/lang/Integer;)V", "I", "getText", "()I", "setText", "(I)V", "getVoiceOverText", "setVoiceOverText", "J", "getBackground-0d7_KjU", "()J", "setBackground-8_81llA", "(J)V", "getTextColor-0d7_KjU", "setTextColor-8_81llA", "app"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class SnackBarInfo {
    public static final int $stable = 8;
    private long background;

    @Nullable
    private Integer icon;
    private int text;
    private long textColor;

    @Nullable
    private Integer voiceOverText;

    /* JADX WARN: Illegal instructions before constructor call */
    public SnackBarInfo(Integer num, int i11, Integer num2, long j9, long j11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        long j12;
        long j13;
        Integer num3 = (i12 & 1) != 0 ? null : num;
        Integer num4 = (i12 & 4) != 0 ? null : num2;
        if ((i12 & 8) != 0) {
            int i13 = s.f28226f0;
            j12 = s.C;
        } else {
            j12 = j9;
        }
        if ((i12 & 16) != 0) {
            int i14 = s.f28226f0;
            j13 = s.J;
        } else {
            j13 = j11;
        }
        this(num3, i11, num4, j12, j13, null);
    }

    /* JADX INFO: renamed from: getBackground-0d7_KjU, reason: not valid java name and from getter */
    public final long getBackground() {
        return this.background;
    }

    @Nullable
    public final Integer getIcon() {
        return this.icon;
    }

    public final int getText() {
        return this.text;
    }

    /* JADX INFO: renamed from: getTextColor-0d7_KjU, reason: not valid java name and from getter */
    public final long getTextColor() {
        return this.textColor;
    }

    @Nullable
    public final Integer getVoiceOverText() {
        return this.voiceOverText;
    }

    /* JADX INFO: renamed from: setBackground-8_81llA, reason: not valid java name */
    public final void m187setBackground8_81llA(long j9) {
        this.background = j9;
    }

    public final void setIcon(@Nullable Integer num) {
        this.icon = num;
    }

    public final void setText(int i11) {
        this.text = i11;
    }

    /* JADX INFO: renamed from: setTextColor-8_81llA, reason: not valid java name */
    public final void m188setTextColor8_81llA(long j9) {
        this.textColor = j9;
    }

    public final void setVoiceOverText(@Nullable Integer num) {
        this.voiceOverText = num;
    }

    private SnackBarInfo(Integer num, int i11, Integer num2, long j9, long j11) {
        this.icon = num;
        this.text = i11;
        this.voiceOverText = num2;
        this.background = j9;
        this.textColor = j11;
    }

    public /* synthetic */ SnackBarInfo(Integer num, int i11, Integer num2, long j9, long j11, DefaultConstructorMarker defaultConstructorMarker) {
        this(num, i11, num2, j9, j11);
    }
}
