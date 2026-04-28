package cv;

import c50.w;
import com.app.tgtg.model.remote.ItemId;
import com.app.tgtg.model.remote.ItemId$$serializer;
import com.app.tgtg.model.remote.StoreId;
import com.app.tgtg.model.remote.StoreId$$serializer;
import com.app.tgtg.model.remote.item.response.ItemType;
import com.app.tgtg.model.remote.item.response.ItemTypeSerializer;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import m90.c1;
import m90.d0;
import m90.e1;
import m90.l0;
import m90.r1;
import o30.f0;
import org.bouncycastle.pqc.crypto.newhope.NewHope;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class c implements d0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final c f13435a;

    @NotNull
    private static final SerialDescriptor descriptor;

    static {
        c cVar = new c();
        f13435a = cVar;
        e1 e1Var = new e1("com.app.tgtg.services.analytics.Impression", cVar, 14);
        e1Var.j("session_id", false);
        e1Var.j("item_id", false);
        e1Var.j("context_type", false);
        e1Var.j("item_stock", false);
        e1Var.j("discover_bucket_id", false);
        e1Var.j("item_position_horizontal", false);
        e1Var.j("item_position_vertical", false);
        e1Var.j("cover_picture_id", false);
        e1Var.j("logo_picture_id", false);
        e1Var.j("deeplink_id", false);
        e1Var.j("platform", false);
        e1Var.j("version", false);
        e1Var.j("store_id", false);
        e1Var.j("item_type", false);
        descriptor = e1Var;
    }

    @Override // m90.d0
    public final KSerializer[] childSerializers() {
        r1 r1Var = r1.f29848a;
        l0 l0Var = l0.f29821a;
        return new KSerializer[]{r1Var, ItemId$$serializer.INSTANCE, h.f13453a, l0Var, f0.B(r1Var), f0.B(l0Var), f0.B(l0Var), f0.B(r1Var), f0.B(r1Var), f0.B(r1Var), f0.B(r1Var), f0.B(r1Var), f0.B(StoreId$$serializer.INSTANCE), f0.B(ItemTypeSerializer.INSTANCE)};
    }

    @Override // i90.b
    public final Object deserialize(Decoder decoder) {
        ItemType itemType;
        String str;
        int i11;
        SerialDescriptor serialDescriptor = descriptor;
        l90.a aVarC = decoder.c(serialDescriptor);
        ItemType itemType2 = null;
        int iQ = 0;
        String str2 = null;
        String strU = null;
        int i12 = 0;
        String strM205unboximpl = null;
        g gVar = null;
        String str3 = null;
        Integer num = null;
        Integer num2 = null;
        String str4 = null;
        String str5 = null;
        String str6 = null;
        String str7 = null;
        boolean z11 = true;
        String strM277unboximpl = null;
        while (z11) {
            int iW = aVarC.w(serialDescriptor);
            switch (iW) {
                case -1:
                    itemType = itemType2;
                    z11 = false;
                    itemType2 = itemType;
                    break;
                case 0:
                    itemType = itemType2;
                    str = strM205unboximpl;
                    strU = aVarC.u(serialDescriptor, 0);
                    i12 |= 1;
                    strM205unboximpl = str;
                    itemType2 = itemType;
                    break;
                case 1:
                    itemType = itemType2;
                    i11 = iQ;
                    String str8 = strM205unboximpl;
                    ItemId itemId = (ItemId) aVarC.n(serialDescriptor, 1, ItemId$$serializer.INSTANCE, str8 != null ? ItemId.m197boximpl(str8) : null);
                    i12 |= 2;
                    strM205unboximpl = itemId != null ? itemId.m205unboximpl() : null;
                    iQ = i11;
                    itemType2 = itemType;
                    break;
                case 2:
                    itemType = itemType2;
                    i11 = iQ;
                    gVar = (g) aVarC.n(serialDescriptor, 2, h.f13453a, gVar);
                    i12 |= 4;
                    iQ = i11;
                    itemType2 = itemType;
                    break;
                case 3:
                    itemType = itemType2;
                    iQ = aVarC.q(serialDescriptor, 3);
                    i12 |= 8;
                    itemType2 = itemType;
                    break;
                case 4:
                    itemType = itemType2;
                    i11 = iQ;
                    str3 = (String) aVarC.m(serialDescriptor, 4, r1.f29848a, str3);
                    i12 |= 16;
                    iQ = i11;
                    itemType2 = itemType;
                    break;
                case 5:
                    itemType = itemType2;
                    i11 = iQ;
                    num = (Integer) aVarC.m(serialDescriptor, 5, l0.f29821a, num);
                    i12 |= 32;
                    iQ = i11;
                    itemType2 = itemType;
                    break;
                case 6:
                    itemType = itemType2;
                    i11 = iQ;
                    num2 = (Integer) aVarC.m(serialDescriptor, 6, l0.f29821a, num2);
                    i12 |= 64;
                    iQ = i11;
                    itemType2 = itemType;
                    break;
                case 7:
                    itemType = itemType2;
                    i11 = iQ;
                    str4 = (String) aVarC.m(serialDescriptor, 7, r1.f29848a, str4);
                    i12 |= 128;
                    iQ = i11;
                    itemType2 = itemType;
                    break;
                case 8:
                    itemType = itemType2;
                    i11 = iQ;
                    str5 = (String) aVarC.m(serialDescriptor, 8, r1.f29848a, str5);
                    i12 |= 256;
                    iQ = i11;
                    itemType2 = itemType;
                    break;
                case 9:
                    itemType = itemType2;
                    i11 = iQ;
                    str6 = (String) aVarC.m(serialDescriptor, 9, r1.f29848a, str6);
                    i12 |= 512;
                    iQ = i11;
                    itemType2 = itemType;
                    break;
                case 10:
                    itemType = itemType2;
                    i11 = iQ;
                    str7 = (String) aVarC.m(serialDescriptor, 10, r1.f29848a, str7);
                    i12 |= 1024;
                    iQ = i11;
                    itemType2 = itemType;
                    break;
                case 11:
                    itemType = itemType2;
                    i11 = iQ;
                    str2 = (String) aVarC.m(serialDescriptor, 11, r1.f29848a, str2);
                    i12 |= NewHope.SENDB_BYTES;
                    iQ = i11;
                    itemType2 = itemType;
                    break;
                case 12:
                    int i13 = iQ;
                    str = strM205unboximpl;
                    itemType = itemType2;
                    StoreId storeId = (StoreId) aVarC.m(serialDescriptor, 12, StoreId$$serializer.INSTANCE, strM277unboximpl != null ? StoreId.m269boximpl(strM277unboximpl) : null);
                    strM277unboximpl = storeId != null ? storeId.m277unboximpl() : null;
                    i12 |= 4096;
                    iQ = i13;
                    strM205unboximpl = str;
                    itemType2 = itemType;
                    break;
                case 13:
                    itemType2 = (ItemType) aVarC.m(serialDescriptor, 13, ItemTypeSerializer.INSTANCE, itemType2);
                    i12 |= 8192;
                    iQ = iQ;
                    strM205unboximpl = strM205unboximpl;
                    break;
                default:
                    w.e(iW);
                    return null;
            }
        }
        ItemType itemType3 = itemType2;
        int i14 = iQ;
        String str9 = strM205unboximpl;
        aVarC.b(serialDescriptor);
        if (16383 != (i12 & 16383)) {
            c1.j(i12, 16383, descriptor);
            throw null;
        }
        e eVar = new e();
        eVar.f13436a = strU;
        eVar.f13437b = "";
        eVar.f13438c = "";
        eVar.f13439d = str9;
        eVar.f13440e = gVar;
        eVar.f13441f = i14;
        eVar.f13442g = str3;
        eVar.f13443h = num;
        eVar.f13444i = num2;
        eVar.f13445j = str4;
        eVar.f13446k = str5;
        eVar.l = str6;
        eVar.f13447m = str7;
        eVar.f13448n = str2;
        eVar.f13449o = strM277unboximpl;
        eVar.f13450p = itemType3;
        eVar.f13451q = null;
        eVar.f13452r = 0L;
        return eVar;
    }

    @Override // i90.b
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        e eVar = (e) obj;
        encoder.getClass();
        eVar.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        l90.b bVarC = encoder.c(serialDescriptor);
        bVarC.q(serialDescriptor, 0, eVar.f13436a);
        bVarC.i(serialDescriptor, 1, ItemId$$serializer.INSTANCE, ItemId.m197boximpl(eVar.f13439d));
        bVarC.i(serialDescriptor, 2, h.f13453a, eVar.f13440e);
        bVarC.m(3, eVar.f13441f, serialDescriptor);
        r1 r1Var = r1.f29848a;
        bVarC.r(serialDescriptor, 4, r1Var, eVar.f13442g);
        l0 l0Var = l0.f29821a;
        bVarC.r(serialDescriptor, 5, l0Var, eVar.f13443h);
        bVarC.r(serialDescriptor, 6, l0Var, eVar.f13444i);
        bVarC.r(serialDescriptor, 7, r1Var, eVar.f13445j);
        bVarC.r(serialDescriptor, 8, r1Var, eVar.f13446k);
        bVarC.r(serialDescriptor, 9, r1Var, eVar.l);
        bVarC.r(serialDescriptor, 10, r1Var, eVar.f13447m);
        bVarC.r(serialDescriptor, 11, r1Var, eVar.f13448n);
        StoreId$$serializer storeId$$serializer = StoreId$$serializer.INSTANCE;
        String str = eVar.f13449o;
        bVarC.r(serialDescriptor, 12, storeId$$serializer, str != null ? StoreId.m269boximpl(str) : null);
        bVarC.r(serialDescriptor, 13, ItemTypeSerializer.INSTANCE, eVar.f13450p);
        bVarC.b(serialDescriptor);
    }
}
