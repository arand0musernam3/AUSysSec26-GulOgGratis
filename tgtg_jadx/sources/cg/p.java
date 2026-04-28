package cg;

import android.os.Parcel;
import android.os.Parcelable;
import java.io.Serializable;
import kotlin.jvm.functions.Function0;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class p implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<p> CREATOR = new ax.n0(28);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f8043a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f8044b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f8045c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f8046d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f8047e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Function0 f8048f;

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.SSAVar.getPhiList()" because "resultVar" is null
        	at jadx.core.dex.visitors.InitCodeVariables.collectConnectedVars(InitCodeVariables.java:119)
        	at jadx.core.dex.visitors.InitCodeVariables.setCodeVar(InitCodeVariables.java:82)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVar(InitCodeVariables.java:74)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVars(InitCodeVariables.java:48)
        	at jadx.core.dex.visitors.InitCodeVariables.visit(InitCodeVariables.java:29)
        */
    public /* synthetic */ p(int r8, java.lang.String r9, java.lang.String r10, java.lang.String r11, java.lang.String r12, kotlin.jvm.functions.Function0 r13, int r14) {
        /*
            r7 = this;
            r0 = r14 & 1
            if (r0 == 0) goto L7
            r8 = 2131231435(0x7f0802cb, float:1.807895E38)
        L7:
            r1 = r8
            r8 = r14 & 2
            r0 = 0
            if (r8 == 0) goto Lf
            r2 = r0
            goto L10
        Lf:
            r2 = r9
        L10:
            r8 = r14 & 8
            if (r8 == 0) goto L1a
            r4 = r0
            r3 = r10
            r5 = r12
            r6 = r13
            r0 = r7
            goto L1f
        L1a:
            r4 = r11
            r0 = r7
            r3 = r10
            r5 = r12
            r6 = r13
        L1f:
            r0.<init>(r1, r2, r3, r4, r5, r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: cg.p.<init>(int, java.lang.String, java.lang.String, java.lang.String, java.lang.String, kotlin.jvm.functions.Function0, int):void");
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        parcel.getClass();
        parcel.writeInt(this.f8043a);
        parcel.writeString(this.f8044b);
        parcel.writeString(this.f8045c);
        parcel.writeString(this.f8046d);
        parcel.writeString(this.f8047e);
        parcel.writeSerializable((Serializable) this.f8048f);
    }

    public p(int i11, String str, String str2, String str3, String str4, Function0 function0) {
        str2.getClass();
        this.f8043a = i11;
        this.f8044b = str;
        this.f8045c = str2;
        this.f8046d = str3;
        this.f8047e = str4;
        this.f8048f = function0;
    }
}
