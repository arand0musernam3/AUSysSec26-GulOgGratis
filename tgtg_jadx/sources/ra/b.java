package ra;

import android.os.Parcel;
import android.util.SparseIntArray;
import q1.e;
import r8.k;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class b extends a {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final SparseIntArray f37820d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Parcel f37821e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f37822f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f37823g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f37824h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f37825i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f37826j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f37827k;

    public b(Parcel parcel) {
        this(parcel, parcel.dataPosition(), parcel.dataSize(), "", new e(0), new e(0), new e(0));
    }

    @Override // ra.a
    public final b a() {
        Parcel parcel = this.f37821e;
        int iDataPosition = parcel.dataPosition();
        int i11 = this.f37826j;
        if (i11 == this.f37822f) {
            i11 = this.f37823g;
        }
        return new b(parcel, iDataPosition, i11, k.p(new StringBuilder(), this.f37824h, "  "), this.f37817a, this.f37818b, this.f37819c);
    }

    @Override // ra.a
    public final boolean e(int i11) {
        while (true) {
            int i12 = this.f37826j;
            int i13 = this.f37827k;
            if (i12 >= this.f37823g) {
                return i13 == i11;
            }
            if (i13 == i11) {
                return true;
            }
            if (String.valueOf(i13).compareTo(String.valueOf(i11)) > 0) {
                return false;
            }
            int i14 = this.f37826j;
            Parcel parcel = this.f37821e;
            parcel.setDataPosition(i14);
            int i15 = parcel.readInt();
            this.f37827k = parcel.readInt();
            this.f37826j += i15;
        }
    }

    @Override // ra.a
    public final void i(int i11) {
        int i12 = this.f37825i;
        SparseIntArray sparseIntArray = this.f37820d;
        Parcel parcel = this.f37821e;
        if (i12 >= 0) {
            int i13 = sparseIntArray.get(i12);
            int iDataPosition = parcel.dataPosition();
            parcel.setDataPosition(i13);
            parcel.writeInt(iDataPosition - i13);
            parcel.setDataPosition(iDataPosition);
        }
        this.f37825i = i11;
        sparseIntArray.put(i11, parcel.dataPosition());
        parcel.writeInt(0);
        parcel.writeInt(i11);
    }

    public b(Parcel parcel, int i11, int i12, String str, e eVar, e eVar2, e eVar3) {
        super(eVar, eVar2, eVar3);
        this.f37820d = new SparseIntArray();
        this.f37825i = -1;
        this.f37827k = -1;
        this.f37821e = parcel;
        this.f37822f = i11;
        this.f37823g = i12;
        this.f37826j = i11;
        this.f37824h = str;
    }
}
