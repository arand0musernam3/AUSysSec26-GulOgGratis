package androidx.fragment.app;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.lifecycle.Lifecycle;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class t1 implements Parcelable {
    public static final Parcelable.Creator<t1> CREATOR = new a00.p0(23);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f3335a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f3336b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f3337c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f3338d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f3339e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f3340f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f3341g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f3342h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final boolean f3343i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final boolean f3344j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final boolean f3345k;
    public final int l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final String f3346m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final int f3347n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final boolean f3348o;

    public t1(Parcel parcel) {
        this.f3335a = parcel.readString();
        this.f3336b = parcel.readString();
        this.f3337c = parcel.readInt() != 0;
        this.f3338d = parcel.readInt() != 0;
        this.f3339e = parcel.readInt();
        this.f3340f = parcel.readInt();
        this.f3341g = parcel.readString();
        this.f3342h = parcel.readInt() != 0;
        this.f3343i = parcel.readInt() != 0;
        this.f3344j = parcel.readInt() != 0;
        this.f3345k = parcel.readInt() != 0;
        this.l = parcel.readInt();
        this.f3346m = parcel.readString();
        this.f3347n = parcel.readInt();
        this.f3348o = parcel.readInt() != 0;
    }

    public final Fragment a(t0 t0Var, ClassLoader classLoader) {
        Fragment fragmentA = t0Var.a(classLoader, this.f3335a);
        fragmentA.mWho = this.f3336b;
        fragmentA.mFromLayout = this.f3337c;
        fragmentA.mInDynamicContainer = this.f3338d;
        fragmentA.mRestored = true;
        fragmentA.mFragmentId = this.f3339e;
        fragmentA.mContainerId = this.f3340f;
        fragmentA.mTag = this.f3341g;
        fragmentA.mRetainInstance = this.f3342h;
        fragmentA.mRemoving = this.f3343i;
        fragmentA.mDetached = this.f3344j;
        fragmentA.mHidden = this.f3345k;
        fragmentA.mMaxState = Lifecycle.State.values()[this.l];
        fragmentA.mTargetWho = this.f3346m;
        fragmentA.mTargetRequestCode = this.f3347n;
        fragmentA.mUserVisibleHint = this.f3348o;
        return fragmentA;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder(128);
        sb2.append("FragmentState{");
        sb2.append(this.f3335a);
        sb2.append(" (");
        sb2.append(this.f3336b);
        sb2.append(")}:");
        if (this.f3337c) {
            sb2.append(" fromLayout");
        }
        if (this.f3338d) {
            sb2.append(" dynamicContainer");
        }
        int i11 = this.f3340f;
        if (i11 != 0) {
            sb2.append(" id=0x");
            sb2.append(Integer.toHexString(i11));
        }
        String str = this.f3341g;
        if (str != null && !str.isEmpty()) {
            sb2.append(" tag=");
            sb2.append(str);
        }
        if (this.f3342h) {
            sb2.append(" retainInstance");
        }
        if (this.f3343i) {
            sb2.append(" removing");
        }
        if (this.f3344j) {
            sb2.append(" detached");
        }
        if (this.f3345k) {
            sb2.append(" hidden");
        }
        String str2 = this.f3346m;
        if (str2 != null) {
            sb2.append(" targetWho=");
            sb2.append(str2);
            sb2.append(" targetRequestCode=");
            sb2.append(this.f3347n);
        }
        if (this.f3348o) {
            sb2.append(" userVisibleHint");
        }
        return sb2.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        parcel.writeString(this.f3335a);
        parcel.writeString(this.f3336b);
        parcel.writeInt(this.f3337c ? 1 : 0);
        parcel.writeInt(this.f3338d ? 1 : 0);
        parcel.writeInt(this.f3339e);
        parcel.writeInt(this.f3340f);
        parcel.writeString(this.f3341g);
        parcel.writeInt(this.f3342h ? 1 : 0);
        parcel.writeInt(this.f3343i ? 1 : 0);
        parcel.writeInt(this.f3344j ? 1 : 0);
        parcel.writeInt(this.f3345k ? 1 : 0);
        parcel.writeInt(this.l);
        parcel.writeString(this.f3346m);
        parcel.writeInt(this.f3347n);
        parcel.writeInt(this.f3348o ? 1 : 0);
    }

    public t1(Fragment fragment) {
        this.f3335a = fragment.getClass().getName();
        this.f3336b = fragment.mWho;
        this.f3337c = fragment.mFromLayout;
        this.f3338d = fragment.mInDynamicContainer;
        this.f3339e = fragment.mFragmentId;
        this.f3340f = fragment.mContainerId;
        this.f3341g = fragment.mTag;
        this.f3342h = fragment.mRetainInstance;
        this.f3343i = fragment.mRemoving;
        this.f3344j = fragment.mDetached;
        this.f3345k = fragment.mHidden;
        this.l = fragment.mMaxState.ordinal();
        this.f3346m = fragment.mTargetWho;
        this.f3347n = fragment.mTargetRequestCode;
        this.f3348o = fragment.mUserVisibleHint;
    }
}
