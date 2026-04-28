package androidx.fragment.app;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.Log;
import androidx.lifecycle.Lifecycle;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class b implements Parcelable {
    public static final Parcelable.Creator<b> CREATOR = new a00.p0(19);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int[] f3141a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f3142b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int[] f3143c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int[] f3144d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f3145e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f3146f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f3147g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f3148h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final CharSequence f3149i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final int f3150j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final CharSequence f3151k;
    public final ArrayList l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final ArrayList f3152m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final boolean f3153n;

    public b(a aVar) {
        int size = aVar.f3395a.size();
        this.f3141a = new int[size * 6];
        if (!aVar.f3401g) {
            com.braze.h2.b("Not on back stack");
            throw null;
        }
        this.f3142b = new ArrayList(size);
        this.f3143c = new int[size];
        this.f3144d = new int[size];
        int i11 = 0;
        for (int i12 = 0; i12 < size; i12++) {
            y1 y1Var = (y1) aVar.f3395a.get(i12);
            int i13 = i11 + 1;
            this.f3141a[i11] = y1Var.f3382a;
            ArrayList arrayList = this.f3142b;
            Fragment fragment = y1Var.f3383b;
            arrayList.add(fragment != null ? fragment.mWho : null);
            int[] iArr = this.f3141a;
            iArr[i13] = y1Var.f3384c ? 1 : 0;
            iArr[i11 + 2] = y1Var.f3385d;
            iArr[i11 + 3] = y1Var.f3386e;
            int i14 = i11 + 5;
            iArr[i11 + 4] = y1Var.f3387f;
            i11 += 6;
            iArr[i14] = y1Var.f3388g;
            this.f3143c[i12] = y1Var.f3389h.ordinal();
            this.f3144d[i12] = y1Var.f3390i.ordinal();
        }
        this.f3145e = aVar.f3400f;
        this.f3146f = aVar.f3403i;
        this.f3147g = aVar.f3134t;
        this.f3148h = aVar.f3404j;
        this.f3149i = aVar.f3405k;
        this.f3150j = aVar.l;
        this.f3151k = aVar.f3406m;
        this.l = aVar.f3407n;
        this.f3152m = aVar.f3408o;
        this.f3153n = aVar.f3409p;
    }

    public final void a(a aVar) {
        int i11 = 0;
        int i12 = 0;
        while (true) {
            int[] iArr = this.f3141a;
            boolean z11 = true;
            if (i11 >= iArr.length) {
                aVar.f3400f = this.f3145e;
                aVar.f3403i = this.f3146f;
                aVar.f3401g = true;
                aVar.f3404j = this.f3148h;
                aVar.f3405k = this.f3149i;
                aVar.l = this.f3150j;
                aVar.f3406m = this.f3151k;
                aVar.f3407n = this.l;
                aVar.f3408o = this.f3152m;
                aVar.f3409p = this.f3153n;
                return;
            }
            y1 y1Var = new y1();
            int i13 = i11 + 1;
            y1Var.f3382a = iArr[i11];
            if (FragmentManager.L(2)) {
                Log.v("FragmentManager", "Instantiate " + aVar + " op #" + i12 + " base fragment #" + iArr[i13]);
            }
            y1Var.f3389h = Lifecycle.State.values()[this.f3143c[i12]];
            y1Var.f3390i = Lifecycle.State.values()[this.f3144d[i12]];
            int i14 = i11 + 2;
            if (iArr[i13] == 0) {
                z11 = false;
            }
            y1Var.f3384c = z11;
            int i15 = iArr[i14];
            y1Var.f3385d = i15;
            int i16 = iArr[i11 + 3];
            y1Var.f3386e = i16;
            int i17 = i11 + 5;
            int i18 = iArr[i11 + 4];
            y1Var.f3387f = i18;
            i11 += 6;
            int i19 = iArr[i17];
            y1Var.f3388g = i19;
            aVar.f3396b = i15;
            aVar.f3397c = i16;
            aVar.f3398d = i18;
            aVar.f3399e = i19;
            aVar.b(y1Var);
            i12++;
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        parcel.writeIntArray(this.f3141a);
        parcel.writeStringList(this.f3142b);
        parcel.writeIntArray(this.f3143c);
        parcel.writeIntArray(this.f3144d);
        parcel.writeInt(this.f3145e);
        parcel.writeString(this.f3146f);
        parcel.writeInt(this.f3147g);
        parcel.writeInt(this.f3148h);
        TextUtils.writeToParcel(this.f3149i, parcel, 0);
        parcel.writeInt(this.f3150j);
        TextUtils.writeToParcel(this.f3151k, parcel, 0);
        parcel.writeStringList(this.l);
        parcel.writeStringList(this.f3152m);
        parcel.writeInt(this.f3153n ? 1 : 0);
    }

    public b(Parcel parcel) {
        this.f3141a = parcel.createIntArray();
        this.f3142b = parcel.createStringArrayList();
        this.f3143c = parcel.createIntArray();
        this.f3144d = parcel.createIntArray();
        this.f3145e = parcel.readInt();
        this.f3146f = parcel.readString();
        this.f3147g = parcel.readInt();
        this.f3148h = parcel.readInt();
        Parcelable.Creator creator = TextUtils.CHAR_SEQUENCE_CREATOR;
        this.f3149i = (CharSequence) creator.createFromParcel(parcel);
        this.f3150j = parcel.readInt();
        this.f3151k = (CharSequence) creator.createFromParcel(parcel);
        this.l = parcel.createStringArrayList();
        this.f3152m = parcel.createStringArrayList();
        this.f3153n = parcel.readInt() != 0;
    }
}
