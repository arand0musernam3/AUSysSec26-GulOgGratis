package com.app.tgtg.model.remote;

import c50.w;
import com.app.tgtg.model.remote.user.requests.DietaryPreferences;
import com.app.tgtg.model.remote.user.requests.DietaryPreferencesSerializer;
import com.app.tgtg.model.remote.user.requests.UserGender;
import com.app.tgtg.model.remote.user.requests.UserGenderSerializer;
import i90.b;
import java.util.List;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import l90.a;
import m90.c1;
import m90.d0;
import m90.e1;
import m90.g;
import m90.r1;
import o30.f0;
import org.bouncycastle.iana.AEADAlgorithm;
import org.bouncycastle.pqc.crypto.newhope.NewHope;
import org.brotli.dec.BrotliInputStream;
import org.jetbrains.annotations.NotNull;
import u70.d;
import u70.j;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"com/app/tgtg/model/remote/UserData.$serializer", "Lm90/d0;", "Lcom/app/tgtg/model/remote/UserData;", "<init>", "()V", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/app/tgtg/model/remote/UserData;)V", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/app/tgtg/model/remote/UserData;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "app"}, k = 1, mv = {2, 3, 0}, xi = 48)
@d
public final /* synthetic */ class UserData$$serializer implements d0 {
    public static final int $stable;

    @NotNull
    public static final UserData$$serializer INSTANCE;

    @NotNull
    private static final SerialDescriptor descriptor;

    static {
        UserData$$serializer userData$$serializer = new UserData$$serializer();
        INSTANCE = userData$$serializer;
        $stable = 8;
        e1 e1Var = new e1("com.app.tgtg.model.remote.UserData", userData$$serializer, 18);
        e1Var.j("user_id", false);
        e1Var.j("name", true);
        e1Var.j("email", true);
        e1Var.j("phone_number", true);
        e1Var.j("newsletter_opt_in", true);
        e1Var.j("push_notifications_opt_in", true);
        e1Var.j("phone_country_code", true);
        e1Var.j("country_id", true);
        e1Var.j("data_sharing_opt_out", true);
        e1Var.j("date_of_birth", true);
        e1Var.j("clear_date_of_birth", true);
        e1Var.j("user_addresses", true);
        e1Var.j("gender", true);
        e1Var.j("clear_gender", true);
        e1Var.j("food_preferences", true);
        e1Var.j("clear_food_preferences", true);
        e1Var.j("collection_times", true);
        e1Var.j("user_points_of_interest", true);
        descriptor = e1Var;
    }

    private UserData$$serializer() {
    }

    @Override // m90.d0
    @NotNull
    public final KSerializer[] childSerializers() {
        j[] jVarArr = UserData.$childSerializers;
        r1 r1Var = r1.f29848a;
        KSerializer kSerializerB = f0.B(r1Var);
        KSerializer kSerializerB2 = f0.B(r1Var);
        g gVar = g.f29797a;
        return new KSerializer[]{UserId$$serializer.INSTANCE, r1Var, kSerializerB, kSerializerB2, gVar, gVar, f0.B(r1Var), f0.B(r1Var), f0.B(gVar), f0.B(r1Var), f0.B(gVar), f0.B((KSerializer) jVarArr[11].getValue()), f0.B(UserGenderSerializer.INSTANCE), f0.B(gVar), f0.B(DietaryPreferencesSerializer.INSTANCE), f0.B(gVar), f0.B((KSerializer) jVarArr[16].getValue()), f0.B((KSerializer) jVarArr[17].getValue())};
    }

    @Override // i90.b
    @NotNull
    public final UserData deserialize(@NotNull Decoder decoder) {
        DietaryPreferences dietaryPreferences;
        String str;
        String str2;
        String str3;
        int i11;
        DietaryPreferences dietaryPreferences2;
        String str4;
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        a aVarC = decoder.c(serialDescriptor);
        j[] jVarArr = UserData.$childSerializers;
        DietaryPreferences dietaryPreferences3 = null;
        Boolean bool = null;
        UserGender userGender = null;
        List list = null;
        Boolean bool2 = null;
        String str5 = null;
        int i12 = 0;
        List list2 = null;
        Boolean bool3 = null;
        List list3 = null;
        String str6 = null;
        String str7 = null;
        Boolean bool4 = null;
        String str8 = null;
        boolean z11 = true;
        String strM294unboximpl = null;
        String str9 = null;
        String strU = null;
        boolean zT = false;
        boolean zT2 = false;
        while (z11) {
            int iW = aVarC.w(serialDescriptor);
            switch (iW) {
                case -1:
                    dietaryPreferences2 = dietaryPreferences3;
                    z11 = false;
                    dietaryPreferences3 = dietaryPreferences2;
                    break;
                case 0:
                    dietaryPreferences = dietaryPreferences3;
                    str = str6;
                    str2 = str8;
                    String str10 = str9;
                    UserId userId = (UserId) aVarC.n(serialDescriptor, 0, UserId$$serializer.INSTANCE, strM294unboximpl != null ? UserId.m286boximpl(strM294unboximpl) : null);
                    strM294unboximpl = userId != null ? userId.m294unboximpl() : null;
                    i12 |= 1;
                    str9 = str10;
                    str6 = str;
                    dietaryPreferences3 = dietaryPreferences;
                    str8 = str2;
                    break;
                case 1:
                    dietaryPreferences2 = dietaryPreferences3;
                    str4 = str6;
                    strU = aVarC.u(serialDescriptor, 1);
                    i12 |= 2;
                    str6 = str4;
                    dietaryPreferences3 = dietaryPreferences2;
                    break;
                case 2:
                    dietaryPreferences = dietaryPreferences3;
                    str2 = str8;
                    str = str6;
                    str9 = (String) aVarC.m(serialDescriptor, 2, r1.f29848a, str9);
                    i12 |= 4;
                    str6 = str;
                    dietaryPreferences3 = dietaryPreferences;
                    str8 = str2;
                    break;
                case 3:
                    dietaryPreferences = dietaryPreferences3;
                    str2 = str8;
                    str6 = (String) aVarC.m(serialDescriptor, 3, r1.f29848a, str6);
                    i12 |= 8;
                    dietaryPreferences3 = dietaryPreferences;
                    str8 = str2;
                    break;
                case 4:
                    dietaryPreferences2 = dietaryPreferences3;
                    str4 = str6;
                    zT = aVarC.t(serialDescriptor, 4);
                    i12 |= 16;
                    str6 = str4;
                    dietaryPreferences3 = dietaryPreferences2;
                    break;
                case 5:
                    dietaryPreferences2 = dietaryPreferences3;
                    str4 = str6;
                    zT2 = aVarC.t(serialDescriptor, 5);
                    i12 |= 32;
                    str6 = str4;
                    dietaryPreferences3 = dietaryPreferences2;
                    break;
                case 6:
                    str4 = str6;
                    dietaryPreferences2 = dietaryPreferences3;
                    str8 = (String) aVarC.m(serialDescriptor, 6, r1.f29848a, str8);
                    i12 |= 64;
                    str6 = str4;
                    dietaryPreferences3 = dietaryPreferences2;
                    break;
                case 7:
                    str3 = str6;
                    str2 = str8;
                    str5 = (String) aVarC.m(serialDescriptor, 7, r1.f29848a, str5);
                    i12 |= 128;
                    str6 = str3;
                    str8 = str2;
                    break;
                case 8:
                    str3 = str6;
                    str2 = str8;
                    bool3 = (Boolean) aVarC.m(serialDescriptor, 8, g.f29797a, bool3);
                    i12 |= 256;
                    str6 = str3;
                    str8 = str2;
                    break;
                case 9:
                    str3 = str6;
                    str2 = str8;
                    str7 = (String) aVarC.m(serialDescriptor, 9, r1.f29848a, str7);
                    i12 |= 512;
                    str6 = str3;
                    str8 = str2;
                    break;
                case 10:
                    str3 = str6;
                    str2 = str8;
                    bool4 = (Boolean) aVarC.m(serialDescriptor, 10, g.f29797a, bool4);
                    i12 |= 1024;
                    str6 = str3;
                    str8 = str2;
                    break;
                case 11:
                    str3 = str6;
                    str2 = str8;
                    list = (List) aVarC.m(serialDescriptor, 11, (b) jVarArr[11].getValue(), list);
                    i12 |= NewHope.SENDB_BYTES;
                    str6 = str3;
                    str8 = str2;
                    break;
                case 12:
                    str3 = str6;
                    str2 = str8;
                    userGender = (UserGender) aVarC.m(serialDescriptor, 12, UserGenderSerializer.INSTANCE, userGender);
                    i12 |= 4096;
                    str6 = str3;
                    str8 = str2;
                    break;
                case 13:
                    str3 = str6;
                    str2 = str8;
                    bool = (Boolean) aVarC.m(serialDescriptor, 13, g.f29797a, bool);
                    i12 |= 8192;
                    str6 = str3;
                    str8 = str2;
                    break;
                case 14:
                    str3 = str6;
                    str2 = str8;
                    dietaryPreferences3 = (DietaryPreferences) aVarC.m(serialDescriptor, 14, DietaryPreferencesSerializer.INSTANCE, dietaryPreferences3);
                    i12 |= BrotliInputStream.DEFAULT_INTERNAL_BUFFER_SIZE;
                    str6 = str3;
                    str8 = str2;
                    break;
                case AEADAlgorithm.AEAD_AES_SIV_CMAC_256 /* 15 */:
                    str3 = str6;
                    str2 = str8;
                    bool2 = (Boolean) aVarC.m(serialDescriptor, 15, g.f29797a, bool2);
                    i11 = 32768;
                    i12 |= i11;
                    str6 = str3;
                    str8 = str2;
                    break;
                case 16:
                    str3 = str6;
                    str2 = str8;
                    list2 = (List) aVarC.m(serialDescriptor, 16, (b) jVarArr[16].getValue(), list2);
                    i11 = 65536;
                    i12 |= i11;
                    str6 = str3;
                    str8 = str2;
                    break;
                case 17:
                    str3 = str6;
                    str2 = str8;
                    list3 = (List) aVarC.m(serialDescriptor, 17, (b) jVarArr[17].getValue(), list3);
                    i11 = 131072;
                    i12 |= i11;
                    str6 = str3;
                    str8 = str2;
                    break;
                default:
                    w.e(iW);
                    return null;
            }
        }
        String str11 = str9;
        aVarC.b(serialDescriptor);
        return new UserData(i12, strM294unboximpl, strU, str11, str6, zT, zT2, str8, str5, bool3, str7, bool4, list, userGender, bool, dietaryPreferences3, bool2, list2, list3, null, null);
    }

    @Override // i90.b
    @NotNull
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(@NotNull Encoder encoder, @NotNull UserData value) {
        encoder.getClass();
        value.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        l90.b bVarC = encoder.c(serialDescriptor);
        UserData.write$Self$app(value, bVarC, serialDescriptor);
        bVarC.b(serialDescriptor);
    }

    @Override // m90.d0
    @NotNull
    public /* bridge */ KSerializer[] typeParametersSerializers() {
        return c1.f29765b;
    }
}
