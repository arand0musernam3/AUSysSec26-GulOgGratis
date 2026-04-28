package com.app.tgtg.model.remote;

import b3.i;
import com.app.tgtg.model.remote.user.requests.DietaryPreferences;
import com.app.tgtg.model.remote.user.requests.DietaryPreferencesSerializer;
import com.app.tgtg.model.remote.user.requests.OnboardingUserAddress;
import com.app.tgtg.model.remote.user.requests.OnboardingUserAddress$$serializer;
import com.app.tgtg.model.remote.user.requests.UserAddress;
import com.app.tgtg.model.remote.user.requests.UserAddress$$serializer;
import com.app.tgtg.model.remote.user.requests.UserGender;
import com.app.tgtg.model.remote.user.requests.UserGenderSerializer;
import com.braze.Constants;
import e0.f;
import i90.h;
import j4.s;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.y;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import l90.b;
import m90.c1;
import m90.d;
import m90.g;
import m90.m1;
import m90.r1;
import n90.c;
import o30.f0;
import org.bouncycastle.pqc.crypto.newhope.NewHope;
import org.brotli.dec.BrotliInputStream;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import r8.k;
import u70.j;
import u70.l;
import u70.m;
import w2.g0;
import w2.l1;
import wt.a;
import y9.w;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
@h
@Metadata(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b(\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\bH\b\u0087\b\u0018\u0000 \u0097\u00012\u00020\u0001:\u0004\u0097\u0001\u0098\u0001Bé\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\n\u001a\u00020\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\b\u0012\u0012\b\u0002\u0010\u0012\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0011\u0018\u00010\u0010\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0013\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0016\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\b\u0012\u0010\b\u0002\u0010\u0019\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0010\u0012\u0010\b\u0002\u0010\u001b\u001a\n\u0012\u0004\u0012\u00020\u001a\u0018\u00010\u0010¢\u0006\u0004\b\u001c\u0010\u001dBß\u0001\b\u0010\u0012\u0006\u0010\u001f\u001a\u00020\u001e\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\n\u001a\u00020\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\r\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\b\u0012\u0010\u0010\u0012\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0011\u0018\u00010\u0010\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\b\u0012\u000e\u0010\u0019\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0010\u0012\u000e\u0010\u001b\u001a\n\u0012\u0004\u0012\u00020\u001a\u0018\u00010\u0010\u0012\b\u0010!\u001a\u0004\u0018\u00010 ¢\u0006\u0004\b\u001c\u0010\"J\r\u0010#\u001a\u00020\b¢\u0006\u0004\b#\u0010$J\u0015\u0010'\u001a\u00020&2\u0006\u0010%\u001a\u00020\b¢\u0006\u0004\b'\u0010(J\u0015\u0010)\u001a\u00020&2\u0006\u0010%\u001a\u00020\b¢\u0006\u0004\b)\u0010(J\r\u0010*\u001a\u00020\b¢\u0006\u0004\b*\u0010$J\r\u0010+\u001a\u00020\u0004¢\u0006\u0004\b+\u0010,J\r\u0010-\u001a\u00020\u0004¢\u0006\u0004\b-\u0010,J\u0010\u0010/\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b.\u0010,J\u0010\u00100\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b0\u0010,J\u0012\u00101\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b1\u0010,J\u0012\u00102\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b2\u0010,J\u0010\u00103\u001a\u00020\bHÆ\u0003¢\u0006\u0004\b3\u0010$J\u0010\u00104\u001a\u00020\bHÆ\u0003¢\u0006\u0004\b4\u0010$J\u0012\u00105\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b5\u0010,J\u0012\u00106\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b6\u00107J\u0012\u00108\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b8\u0010,J\u0012\u00109\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b9\u00107J\u001a\u0010:\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0011\u0018\u00010\u0010HÆ\u0003¢\u0006\u0004\b:\u0010;J\u0012\u0010<\u001a\u0004\u0018\u00010\u0013HÆ\u0003¢\u0006\u0004\b<\u0010=J\u0012\u0010>\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b>\u00107J\u0012\u0010?\u001a\u0004\u0018\u00010\u0016HÆ\u0003¢\u0006\u0004\b?\u0010@J\u0012\u0010A\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\bA\u00107J\u0018\u0010B\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0010HÆ\u0003¢\u0006\u0004\bB\u0010;J\u0018\u0010C\u001a\n\u0012\u0004\u0012\u00020\u001a\u0018\u00010\u0010HÆ\u0003¢\u0006\u0004\bC\u0010;Jô\u0001\u0010F\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\b2\u0012\b\u0002\u0010\u0012\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0011\u0018\u00010\u00102\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00132\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00162\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\b2\u0010\b\u0002\u0010\u0019\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00102\u0010\b\u0002\u0010\u001b\u001a\n\u0012\u0004\u0012\u00020\u001a\u0018\u00010\u0010HÆ\u0001¢\u0006\u0004\bD\u0010EJ\u0010\u0010G\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\bG\u0010,J\u0010\u0010H\u001a\u00020\u001eHÖ\u0001¢\u0006\u0004\bH\u0010IJ\u001a\u0010K\u001a\u00020\b2\b\u0010J\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\bK\u0010LJ\u0012\u0010M\u001a\u0004\u0018\u00010\u0004HÂ\u0003¢\u0006\u0004\bM\u0010,J'\u0010U\u001a\u00020&2\u0006\u0010N\u001a\u00020\u00002\u0006\u0010P\u001a\u00020O2\u0006\u0010R\u001a\u00020QH\u0001¢\u0006\u0004\bS\u0010TR \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010V\u0012\u0004\bX\u0010Y\u001a\u0004\bW\u0010,R(\u0010\u0005\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b\u0005\u0010V\u0012\u0004\b]\u0010Y\u001a\u0004\bZ\u0010,\"\u0004\b[\u0010\\R*\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b\u0006\u0010V\u0012\u0004\b`\u0010Y\u001a\u0004\b^\u0010,\"\u0004\b_\u0010\\R*\u0010\u0007\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b\u0007\u0010V\u0012\u0004\bc\u0010Y\u001a\u0004\ba\u0010,\"\u0004\bb\u0010\\R(\u0010\t\u001a\u00020\b8\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b\t\u0010d\u0012\u0004\bg\u0010Y\u001a\u0004\be\u0010$\"\u0004\bf\u0010(R(\u0010\n\u001a\u00020\b8\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b\n\u0010d\u0012\u0004\bj\u0010Y\u001a\u0004\bh\u0010$\"\u0004\bi\u0010(R*\u0010\u000b\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b\u000b\u0010V\u0012\u0004\bm\u0010Y\u001a\u0004\bk\u0010,\"\u0004\bl\u0010\\R\u001e\u0010\f\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0083\u000e¢\u0006\f\n\u0004\b\f\u0010V\u0012\u0004\bn\u0010YR*\u0010\r\u001a\u0004\u0018\u00010\b8\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b\r\u0010o\u0012\u0004\bs\u0010Y\u001a\u0004\bp\u00107\"\u0004\bq\u0010rR*\u0010\u000e\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b\u000e\u0010V\u0012\u0004\bv\u0010Y\u001a\u0004\bt\u0010,\"\u0004\bu\u0010\\R*\u0010\u000f\u001a\u0004\u0018\u00010\b8\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b\u000f\u0010o\u0012\u0004\by\u0010Y\u001a\u0004\bw\u00107\"\u0004\bx\u0010rR2\u0010\u0012\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0011\u0018\u00010\u00108\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b\u0012\u0010z\u0012\u0004\b~\u0010Y\u001a\u0004\b{\u0010;\"\u0004\b|\u0010}R.\u0010\u0014\u001a\u0004\u0018\u00010\u00138\u0006@\u0006X\u0087\u000e¢\u0006\u001c\n\u0004\b\u0014\u0010\u007f\u0012\u0005\b\u0083\u0001\u0010Y\u001a\u0005\b\u0080\u0001\u0010=\"\u0006\b\u0081\u0001\u0010\u0082\u0001R-\u0010\u0015\u001a\u0004\u0018\u00010\b8\u0006@\u0006X\u0087\u000e¢\u0006\u001b\n\u0004\b\u0015\u0010o\u0012\u0005\b\u0086\u0001\u0010Y\u001a\u0005\b\u0084\u0001\u00107\"\u0005\b\u0085\u0001\u0010rR/\u0010\u0017\u001a\u0004\u0018\u00010\u00168\u0006@\u0006X\u0087\u000e¢\u0006\u001d\n\u0005\b\u0017\u0010\u0087\u0001\u0012\u0005\b\u008b\u0001\u0010Y\u001a\u0005\b\u0088\u0001\u0010@\"\u0006\b\u0089\u0001\u0010\u008a\u0001R-\u0010\u0018\u001a\u0004\u0018\u00010\b8\u0006@\u0006X\u0087\u000e¢\u0006\u001b\n\u0004\b\u0018\u0010o\u0012\u0005\b\u008e\u0001\u0010Y\u001a\u0005\b\u008c\u0001\u00107\"\u0005\b\u008d\u0001\u0010rR3\u0010\u0019\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00108\u0006@\u0006X\u0087\u000e¢\u0006\u001b\n\u0004\b\u0019\u0010z\u0012\u0005\b\u0091\u0001\u0010Y\u001a\u0005\b\u008f\u0001\u0010;\"\u0005\b\u0090\u0001\u0010}R3\u0010\u001b\u001a\n\u0012\u0004\u0012\u00020\u001a\u0018\u00010\u00108\u0006@\u0006X\u0087\u000e¢\u0006\u001b\n\u0004\b\u001b\u0010z\u0012\u0005\b\u0094\u0001\u0010Y\u001a\u0005\b\u0092\u0001\u0010;\"\u0005\b\u0093\u0001\u0010}R\u0015\u0010\u0096\u0001\u001a\u0004\u0018\u00010\u00048F¢\u0006\u0007\u001a\u0005\b\u0095\u0001\u0010,¨\u0006\u0099\u0001"}, d2 = {"Lcom/app/tgtg/model/remote/UserData;", "", "Lcom/app/tgtg/model/remote/UserId;", "userId", "", "name", "email", "phoneNumber", "", "newsletterOptIn", "pushNotificationOptIn", "phoneCountryCode", "countryCode", "dataSharingOptOut", "birthDate", "clearDateOfBirth", "", "Lcom/app/tgtg/model/remote/user/requests/UserAddress;", "userAddresses", "Lcom/app/tgtg/model/remote/user/requests/UserGender;", "gender", "clearGender", "Lcom/app/tgtg/model/remote/user/requests/DietaryPreferences;", "dietary", "clearDietary", "collectionTimes", "Lcom/app/tgtg/model/remote/user/requests/OnboardingUserAddress;", "userPointsOfInterests", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZLjava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/Boolean;Ljava/util/List;Lcom/app/tgtg/model/remote/user/requests/UserGender;Ljava/lang/Boolean;Lcom/app/tgtg/model/remote/user/requests/DietaryPreferences;Ljava/lang/Boolean;Ljava/util/List;Ljava/util/List;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "", "seen0", "Lm90/m1;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZLjava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/Boolean;Ljava/util/List;Lcom/app/tgtg/model/remote/user/requests/UserGender;Ljava/lang/Boolean;Lcom/app/tgtg/model/remote/user/requests/DietaryPreferences;Ljava/lang/Boolean;Ljava/util/List;Ljava/util/List;Lm90/m1;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "wantsNewsletter", "()Z", "wants", "", "setWantsNewsletter", "(Z)V", "setWantsPushNotifications", "wantsPushNotifications", "getCountryCode", "()Ljava/lang/String;", "toJson", "component1-8nKqa5U", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component9", "()Ljava/lang/Boolean;", "component10", "component11", "component12", "()Ljava/util/List;", "component13", "()Lcom/app/tgtg/model/remote/user/requests/UserGender;", "component14", "component15", "()Lcom/app/tgtg/model/remote/user/requests/DietaryPreferences;", "component16", "component17", "component18", "copy-W558gQQ", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZLjava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/Boolean;Ljava/util/List;Lcom/app/tgtg/model/remote/user/requests/UserGender;Ljava/lang/Boolean;Lcom/app/tgtg/model/remote/user/requests/DietaryPreferences;Ljava/lang/Boolean;Ljava/util/List;Ljava/util/List;)Lcom/app/tgtg/model/remote/UserData;", "copy", "toString", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "component8", "self", "Ll90/b;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "write$Self$app", "(Lcom/app/tgtg/model/remote/UserData;Ll90/b;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "Ljava/lang/String;", "getUserId-8nKqa5U", "getUserId-8nKqa5U$annotations", "()V", "getName", "setName", "(Ljava/lang/String;)V", "getName$annotations", "getEmail", "setEmail", "getEmail$annotations", "getPhoneNumber", "setPhoneNumber", "getPhoneNumber$annotations", "Z", "getNewsletterOptIn", "setNewsletterOptIn", "getNewsletterOptIn$annotations", "getPushNotificationOptIn", "setPushNotificationOptIn", "getPushNotificationOptIn$annotations", "getPhoneCountryCode", "setPhoneCountryCode", "getPhoneCountryCode$annotations", "getCountryCode$annotations", "Ljava/lang/Boolean;", "getDataSharingOptOut", "setDataSharingOptOut", "(Ljava/lang/Boolean;)V", "getDataSharingOptOut$annotations", "getBirthDate", "setBirthDate", "getBirthDate$annotations", "getClearDateOfBirth", "setClearDateOfBirth", "getClearDateOfBirth$annotations", "Ljava/util/List;", "getUserAddresses", "setUserAddresses", "(Ljava/util/List;)V", "getUserAddresses$annotations", "Lcom/app/tgtg/model/remote/user/requests/UserGender;", "getGender", "setGender", "(Lcom/app/tgtg/model/remote/user/requests/UserGender;)V", "getGender$annotations", "getClearGender", "setClearGender", "getClearGender$annotations", "Lcom/app/tgtg/model/remote/user/requests/DietaryPreferences;", "getDietary", "setDietary", "(Lcom/app/tgtg/model/remote/user/requests/DietaryPreferences;)V", "getDietary$annotations", "getClearDietary", "setClearDietary", "getClearDietary$annotations", "getCollectionTimes", "setCollectionTimes", "getCollectionTimes$annotations", "getUserPointsOfInterests", "setUserPointsOfInterests", "getUserPointsOfInterests$annotations", "getCountryIso", "countryIso", "Companion", "$serializer", "app"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class UserData {

    @NotNull
    private static final j[] $childSerializers;

    @NotNull
    private static final c json;

    @Nullable
    private String birthDate;

    @Nullable
    private Boolean clearDateOfBirth;

    @Nullable
    private Boolean clearDietary;

    @Nullable
    private Boolean clearGender;

    @Nullable
    private List<String> collectionTimes;

    @Nullable
    private String countryCode;

    @Nullable
    private Boolean dataSharingOptOut;

    @Nullable
    private DietaryPreferences dietary;

    @Nullable
    private String email;

    @Nullable
    private UserGender gender;

    @NotNull
    private String name;
    private boolean newsletterOptIn;

    @Nullable
    private String phoneCountryCode;

    @Nullable
    private String phoneNumber;
    private boolean pushNotificationOptIn;

    @Nullable
    private List<UserAddress> userAddresses;

    @NotNull
    private final String userId;

    @Nullable
    private List<OnboardingUserAddress> userPointsOfInterests;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    static {
        m mVar = m.PUBLICATION;
        $childSerializers = new j[]{null, null, null, null, null, null, null, null, null, null, null, l.a(mVar, new a(5)), null, null, null, null, l.a(mVar, new a(6)), l.a(mVar, new a(7))};
        json = w.h(new g0(4));
    }

    private /* synthetic */ UserData(int i11, String str, String str2, String str3, String str4, boolean z11, boolean z12, String str5, String str6, Boolean bool, String str7, Boolean bool2, List list, UserGender userGender, Boolean bool3, DietaryPreferences dietaryPreferences, Boolean bool4, List list2, List list3, m1 m1Var) {
        if (1 != (i11 & 1)) {
            c1.j(i11, 1, UserData$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.userId = str;
        if ((i11 & 2) == 0) {
            this.name = "";
        } else {
            this.name = str2;
        }
        if ((i11 & 4) == 0) {
            this.email = null;
        } else {
            this.email = str3;
        }
        if ((i11 & 8) == 0) {
            this.phoneNumber = "";
        } else {
            this.phoneNumber = str4;
        }
        if ((i11 & 16) == 0) {
            this.newsletterOptIn = false;
        } else {
            this.newsletterOptIn = z11;
        }
        if ((i11 & 32) == 0) {
            this.pushNotificationOptIn = false;
        } else {
            this.pushNotificationOptIn = z12;
        }
        if ((i11 & 64) == 0) {
            this.phoneCountryCode = null;
        } else {
            this.phoneCountryCode = str5;
        }
        if ((i11 & 128) == 0) {
            this.countryCode = null;
        } else {
            this.countryCode = str6;
        }
        if ((i11 & 256) == 0) {
            this.dataSharingOptOut = null;
        } else {
            this.dataSharingOptOut = bool;
        }
        if ((i11 & 512) == 0) {
            this.birthDate = null;
        } else {
            this.birthDate = str7;
        }
        if ((i11 & 1024) == 0) {
            this.clearDateOfBirth = null;
        } else {
            this.clearDateOfBirth = bool2;
        }
        if ((i11 & NewHope.SENDB_BYTES) == 0) {
            this.userAddresses = null;
        } else {
            this.userAddresses = list;
        }
        if ((i11 & 4096) == 0) {
            this.gender = null;
        } else {
            this.gender = userGender;
        }
        if ((i11 & 8192) == 0) {
            this.clearGender = null;
        } else {
            this.clearGender = bool3;
        }
        if ((i11 & BrotliInputStream.DEFAULT_INTERNAL_BUFFER_SIZE) == 0) {
            this.dietary = null;
        } else {
            this.dietary = dietaryPreferences;
        }
        if ((32768 & i11) == 0) {
            this.clearDietary = null;
        } else {
            this.clearDietary = bool4;
        }
        if ((65536 & i11) == 0) {
            this.collectionTimes = null;
        } else {
            this.collectionTimes = list2;
        }
        if ((i11 & 131072) == 0) {
            this.userPointsOfInterests = null;
        } else {
            this.userPointsOfInterests = list3;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
        return new d(f0.B(UserAddress$$serializer.INSTANCE), 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_$0() {
        return new d(r1.f29848a, 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_$1() {
        return new d(OnboardingUserAddress$$serializer.INSTANCE, 0);
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    private final String getCountryCode() {
        return this.countryCode;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: copy-W558gQQ$default, reason: not valid java name */
    public static /* synthetic */ UserData m281copyW558gQQ$default(UserData userData, String str, String str2, String str3, String str4, boolean z11, boolean z12, String str5, String str6, Boolean bool, String str7, Boolean bool2, List list, UserGender userGender, Boolean bool3, DietaryPreferences dietaryPreferences, Boolean bool4, List list2, List list3, int i11, Object obj) {
        List list4;
        List list5;
        String str8 = (i11 & 1) != 0 ? userData.userId : str;
        String str9 = (i11 & 2) != 0 ? userData.name : str2;
        String str10 = (i11 & 4) != 0 ? userData.email : str3;
        String str11 = (i11 & 8) != 0 ? userData.phoneNumber : str4;
        boolean z13 = (i11 & 16) != 0 ? userData.newsletterOptIn : z11;
        boolean z14 = (i11 & 32) != 0 ? userData.pushNotificationOptIn : z12;
        String str12 = (i11 & 64) != 0 ? userData.phoneCountryCode : str5;
        String str13 = (i11 & 128) != 0 ? userData.countryCode : str6;
        Boolean bool5 = (i11 & 256) != 0 ? userData.dataSharingOptOut : bool;
        String str14 = (i11 & 512) != 0 ? userData.birthDate : str7;
        Boolean bool6 = (i11 & 1024) != 0 ? userData.clearDateOfBirth : bool2;
        List list6 = (i11 & NewHope.SENDB_BYTES) != 0 ? userData.userAddresses : list;
        UserGender userGender2 = (i11 & 4096) != 0 ? userData.gender : userGender;
        Boolean bool7 = (i11 & 8192) != 0 ? userData.clearGender : bool3;
        String str15 = str8;
        DietaryPreferences dietaryPreferences2 = (i11 & BrotliInputStream.DEFAULT_INTERNAL_BUFFER_SIZE) != 0 ? userData.dietary : dietaryPreferences;
        Boolean bool8 = (i11 & 32768) != 0 ? userData.clearDietary : bool4;
        List list7 = (i11 & 65536) != 0 ? userData.collectionTimes : list2;
        if ((i11 & 131072) != 0) {
            list5 = list7;
            list4 = userData.userPointsOfInterests;
        } else {
            list4 = list3;
            list5 = list7;
        }
        return userData.m284copyW558gQQ(str15, str9, str10, str11, z13, z14, str12, str13, bool5, str14, bool6, list6, userGender2, bool7, dietaryPreferences2, bool8, list5, list4);
    }

    @NotNull
    public static final UserData fromJson(@NotNull String str) {
        return INSTANCE.fromJson(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit json$lambda$0(n90.h hVar) {
        hVar.getClass();
        hVar.f30766c = true;
        return Unit.f26487a;
    }

    public static final /* synthetic */ void write$Self$app(UserData self, b output, SerialDescriptor serialDesc) {
        j[] jVarArr = $childSerializers;
        output.i(serialDesc, 0, UserId$$serializer.INSTANCE, UserId.m286boximpl(self.userId));
        output.q(serialDesc, 1, self.name);
        if (output.C(serialDesc) || self.email != null) {
            output.r(serialDesc, 2, r1.f29848a, self.email);
        }
        r1 r1Var = r1.f29848a;
        output.r(serialDesc, 3, r1Var, self.phoneNumber);
        output.p(serialDesc, 4, self.newsletterOptIn);
        output.p(serialDesc, 5, self.pushNotificationOptIn);
        if (output.C(serialDesc) || self.phoneCountryCode != null) {
            output.r(serialDesc, 6, r1Var, self.phoneCountryCode);
        }
        if (output.C(serialDesc) || self.countryCode != null) {
            output.r(serialDesc, 7, r1Var, self.countryCode);
        }
        if (output.C(serialDesc) || self.dataSharingOptOut != null) {
            output.r(serialDesc, 8, g.f29797a, self.dataSharingOptOut);
        }
        if (output.C(serialDesc) || self.birthDate != null) {
            output.r(serialDesc, 9, r1Var, self.birthDate);
        }
        if (output.C(serialDesc) || self.clearDateOfBirth != null) {
            output.r(serialDesc, 10, g.f29797a, self.clearDateOfBirth);
        }
        if (output.C(serialDesc) || self.userAddresses != null) {
            output.r(serialDesc, 11, (KSerializer) jVarArr[11].getValue(), self.userAddresses);
        }
        if (output.C(serialDesc) || self.gender != null) {
            output.r(serialDesc, 12, UserGenderSerializer.INSTANCE, self.gender);
        }
        if (output.C(serialDesc) || self.clearGender != null) {
            output.r(serialDesc, 13, g.f29797a, self.clearGender);
        }
        if (output.C(serialDesc) || self.dietary != null) {
            output.r(serialDesc, 14, DietaryPreferencesSerializer.INSTANCE, self.dietary);
        }
        if (output.C(serialDesc) || self.clearDietary != null) {
            output.r(serialDesc, 15, g.f29797a, self.clearDietary);
        }
        if (output.C(serialDesc) || self.collectionTimes != null) {
            output.r(serialDesc, 16, (KSerializer) jVarArr[16].getValue(), self.collectionTimes);
        }
        if (!output.C(serialDesc) && self.userPointsOfInterests == null) {
            return;
        }
        output.r(serialDesc, 17, (KSerializer) jVarArr[17].getValue(), self.userPointsOfInterests);
    }

    @NotNull
    /* JADX INFO: renamed from: component1-8nKqa5U, reason: not valid java name and from getter */
    public final String getUserId() {
        return this.userId;
    }

    @Nullable
    /* JADX INFO: renamed from: component10, reason: from getter */
    public final String getBirthDate() {
        return this.birthDate;
    }

    @Nullable
    /* JADX INFO: renamed from: component11, reason: from getter */
    public final Boolean getClearDateOfBirth() {
        return this.clearDateOfBirth;
    }

    @Nullable
    public final List<UserAddress> component12() {
        return this.userAddresses;
    }

    @Nullable
    /* JADX INFO: renamed from: component13, reason: from getter */
    public final UserGender getGender() {
        return this.gender;
    }

    @Nullable
    /* JADX INFO: renamed from: component14, reason: from getter */
    public final Boolean getClearGender() {
        return this.clearGender;
    }

    @Nullable
    /* JADX INFO: renamed from: component15, reason: from getter */
    public final DietaryPreferences getDietary() {
        return this.dietary;
    }

    @Nullable
    /* JADX INFO: renamed from: component16, reason: from getter */
    public final Boolean getClearDietary() {
        return this.clearDietary;
    }

    @Nullable
    public final List<String> component17() {
        return this.collectionTimes;
    }

    @Nullable
    public final List<OnboardingUserAddress> component18() {
        return this.userPointsOfInterests;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getName() {
        return this.name;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getEmail() {
        return this.email;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getPhoneNumber() {
        return this.phoneNumber;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final boolean getNewsletterOptIn() {
        return this.newsletterOptIn;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final boolean getPushNotificationOptIn() {
        return this.pushNotificationOptIn;
    }

    @Nullable
    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getPhoneCountryCode() {
        return this.phoneCountryCode;
    }

    @Nullable
    /* JADX INFO: renamed from: component9, reason: from getter */
    public final Boolean getDataSharingOptOut() {
        return this.dataSharingOptOut;
    }

    @NotNull
    /* JADX INFO: renamed from: copy-W558gQQ, reason: not valid java name */
    public final UserData m284copyW558gQQ(@NotNull String userId, @NotNull String name, @Nullable String email, @Nullable String phoneNumber, boolean newsletterOptIn, boolean pushNotificationOptIn, @Nullable String phoneCountryCode, @Nullable String countryCode, @Nullable Boolean dataSharingOptOut, @Nullable String birthDate, @Nullable Boolean clearDateOfBirth, @Nullable List<UserAddress> userAddresses, @Nullable UserGender gender, @Nullable Boolean clearGender, @Nullable DietaryPreferences dietary, @Nullable Boolean clearDietary, @Nullable List<String> collectionTimes, @Nullable List<OnboardingUserAddress> userPointsOfInterests) {
        userId.getClass();
        name.getClass();
        return new UserData(userId, name, email, phoneNumber, newsletterOptIn, pushNotificationOptIn, phoneCountryCode, countryCode, dataSharingOptOut, birthDate, clearDateOfBirth, userAddresses, gender, clearGender, dietary, clearDietary, collectionTimes, userPointsOfInterests, null);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof UserData)) {
            return false;
        }
        UserData userData = (UserData) other;
        return UserId.m290equalsimpl0(this.userId, userData.userId) && Intrinsics.areEqual(this.name, userData.name) && Intrinsics.areEqual(this.email, userData.email) && Intrinsics.areEqual(this.phoneNumber, userData.phoneNumber) && this.newsletterOptIn == userData.newsletterOptIn && this.pushNotificationOptIn == userData.pushNotificationOptIn && Intrinsics.areEqual(this.phoneCountryCode, userData.phoneCountryCode) && Intrinsics.areEqual(this.countryCode, userData.countryCode) && Intrinsics.areEqual(this.dataSharingOptOut, userData.dataSharingOptOut) && Intrinsics.areEqual(this.birthDate, userData.birthDate) && Intrinsics.areEqual(this.clearDateOfBirth, userData.clearDateOfBirth) && Intrinsics.areEqual(this.userAddresses, userData.userAddresses) && this.gender == userData.gender && Intrinsics.areEqual(this.clearGender, userData.clearGender) && this.dietary == userData.dietary && Intrinsics.areEqual(this.clearDietary, userData.clearDietary) && Intrinsics.areEqual(this.collectionTimes, userData.collectionTimes) && Intrinsics.areEqual(this.userPointsOfInterests, userData.userPointsOfInterests);
    }

    @Nullable
    public final String getBirthDate() {
        return this.birthDate;
    }

    @Nullable
    public final Boolean getClearDateOfBirth() {
        return this.clearDateOfBirth;
    }

    @Nullable
    public final Boolean getClearDietary() {
        return this.clearDietary;
    }

    @Nullable
    public final Boolean getClearGender() {
        return this.clearGender;
    }

    @Nullable
    public final List<String> getCollectionTimes() {
        return this.collectionTimes;
    }

    @NotNull
    public final String getCountryCode() {
        String str = this.countryCode;
        if (str == null || str.length() == 0) {
            return "DK";
        }
        String str2 = this.countryCode;
        str2.getClass();
        return str2;
    }

    @Nullable
    public final String getCountryIso() {
        return y.k(this.countryCode, "uk", true) ? "GB" : this.countryCode;
    }

    @Nullable
    public final Boolean getDataSharingOptOut() {
        return this.dataSharingOptOut;
    }

    @Nullable
    public final DietaryPreferences getDietary() {
        return this.dietary;
    }

    @Nullable
    public final String getEmail() {
        return this.email;
    }

    @Nullable
    public final UserGender getGender() {
        return this.gender;
    }

    @NotNull
    public final String getName() {
        return this.name;
    }

    public final boolean getNewsletterOptIn() {
        return this.newsletterOptIn;
    }

    @Nullable
    public final String getPhoneCountryCode() {
        return this.phoneCountryCode;
    }

    @Nullable
    public final String getPhoneNumber() {
        return this.phoneNumber;
    }

    public final boolean getPushNotificationOptIn() {
        return this.pushNotificationOptIn;
    }

    @Nullable
    public final List<UserAddress> getUserAddresses() {
        return this.userAddresses;
    }

    @NotNull
    /* JADX INFO: renamed from: getUserId-8nKqa5U, reason: not valid java name */
    public final String m285getUserId8nKqa5U() {
        return this.userId;
    }

    @Nullable
    public final List<OnboardingUserAddress> getUserPointsOfInterests() {
        return this.userPointsOfInterests;
    }

    public int hashCode() {
        int iB = l1.b(UserId.m291hashCodeimpl(this.userId) * 31, 31, this.name);
        String str = this.email;
        int iHashCode = (iB + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.phoneNumber;
        int iE = k.e(k.e((iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.newsletterOptIn), 31, this.pushNotificationOptIn);
        String str3 = this.phoneCountryCode;
        int iHashCode2 = (iE + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.countryCode;
        int iHashCode3 = (iHashCode2 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Boolean bool = this.dataSharingOptOut;
        int iHashCode4 = (iHashCode3 + (bool == null ? 0 : bool.hashCode())) * 31;
        String str5 = this.birthDate;
        int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        Boolean bool2 = this.clearDateOfBirth;
        int iHashCode6 = (iHashCode5 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        List<UserAddress> list = this.userAddresses;
        int iHashCode7 = (iHashCode6 + (list == null ? 0 : list.hashCode())) * 31;
        UserGender userGender = this.gender;
        int iHashCode8 = (iHashCode7 + (userGender == null ? 0 : userGender.hashCode())) * 31;
        Boolean bool3 = this.clearGender;
        int iHashCode9 = (iHashCode8 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
        DietaryPreferences dietaryPreferences = this.dietary;
        int iHashCode10 = (iHashCode9 + (dietaryPreferences == null ? 0 : dietaryPreferences.hashCode())) * 31;
        Boolean bool4 = this.clearDietary;
        int iHashCode11 = (iHashCode10 + (bool4 == null ? 0 : bool4.hashCode())) * 31;
        List<String> list2 = this.collectionTimes;
        int iHashCode12 = (iHashCode11 + (list2 == null ? 0 : list2.hashCode())) * 31;
        List<OnboardingUserAddress> list3 = this.userPointsOfInterests;
        return iHashCode12 + (list3 != null ? list3.hashCode() : 0);
    }

    public final void setBirthDate(@Nullable String str) {
        this.birthDate = str;
    }

    public final void setClearDateOfBirth(@Nullable Boolean bool) {
        this.clearDateOfBirth = bool;
    }

    public final void setClearDietary(@Nullable Boolean bool) {
        this.clearDietary = bool;
    }

    public final void setClearGender(@Nullable Boolean bool) {
        this.clearGender = bool;
    }

    public final void setCollectionTimes(@Nullable List<String> list) {
        this.collectionTimes = list;
    }

    public final void setDataSharingOptOut(@Nullable Boolean bool) {
        this.dataSharingOptOut = bool;
    }

    public final void setDietary(@Nullable DietaryPreferences dietaryPreferences) {
        this.dietary = dietaryPreferences;
    }

    public final void setEmail(@Nullable String str) {
        this.email = str;
    }

    public final void setGender(@Nullable UserGender userGender) {
        this.gender = userGender;
    }

    public final void setName(@NotNull String str) {
        str.getClass();
        this.name = str;
    }

    public final void setNewsletterOptIn(boolean z11) {
        this.newsletterOptIn = z11;
    }

    public final void setPhoneCountryCode(@Nullable String str) {
        this.phoneCountryCode = str;
    }

    public final void setPhoneNumber(@Nullable String str) {
        this.phoneNumber = str;
    }

    public final void setPushNotificationOptIn(boolean z11) {
        this.pushNotificationOptIn = z11;
    }

    public final void setUserAddresses(@Nullable List<UserAddress> list) {
        this.userAddresses = list;
    }

    public final void setUserPointsOfInterests(@Nullable List<OnboardingUserAddress> list) {
        this.userPointsOfInterests = list;
    }

    public final void setWantsNewsletter(boolean wants) {
        this.newsletterOptIn = wants;
    }

    public final void setWantsPushNotifications(boolean wants) {
        this.pushNotificationOptIn = wants;
    }

    @NotNull
    public final String toJson() {
        return c.f30748d.c(INSTANCE.serializer(), this);
    }

    @NotNull
    public String toString() {
        String strM292toStringimpl = UserId.m292toStringimpl(this.userId);
        String str = this.name;
        String str2 = this.email;
        String str3 = this.phoneNumber;
        boolean z11 = this.newsletterOptIn;
        boolean z12 = this.pushNotificationOptIn;
        String str4 = this.phoneCountryCode;
        String str5 = this.countryCode;
        Boolean bool = this.dataSharingOptOut;
        String str6 = this.birthDate;
        Boolean bool2 = this.clearDateOfBirth;
        List<UserAddress> list = this.userAddresses;
        UserGender userGender = this.gender;
        Boolean bool3 = this.clearGender;
        DietaryPreferences dietaryPreferences = this.dietary;
        Boolean bool4 = this.clearDietary;
        List<String> list2 = this.collectionTimes;
        List<OnboardingUserAddress> list3 = this.userPointsOfInterests;
        StringBuilder sbT = f.t("UserData(userId=", strM292toStringimpl, ", name=", str, ", email=");
        s.A(sbT, str2, ", phoneNumber=", str3, ", newsletterOptIn=");
        i.C(sbT, z11, ", pushNotificationOptIn=", z12, ", phoneCountryCode=");
        s.A(sbT, str4, ", countryCode=", str5, ", dataSharingOptOut=");
        sbT.append(bool);
        sbT.append(", birthDate=");
        sbT.append(str6);
        sbT.append(", clearDateOfBirth=");
        sbT.append(bool2);
        sbT.append(", userAddresses=");
        sbT.append(list);
        sbT.append(", gender=");
        sbT.append(userGender);
        sbT.append(", clearGender=");
        sbT.append(bool3);
        sbT.append(", dietary=");
        sbT.append(dietaryPreferences);
        sbT.append(", clearDietary=");
        sbT.append(bool4);
        sbT.append(", collectionTimes=");
        sbT.append(list2);
        sbT.append(", userPointsOfInterests=");
        sbT.append(list3);
        sbT.append(")");
        return sbT.toString();
    }

    public final boolean wantsNewsletter() {
        return this.newsletterOptIn;
    }

    public final boolean wantsPushNotifications() {
        return this.pushNotificationOptIn;
    }

    public /* synthetic */ UserData(String str, String str2, String str3, String str4, boolean z11, boolean z12, String str5, String str6, Boolean bool, String str7, Boolean bool2, List list, UserGender userGender, Boolean bool3, DietaryPreferences dietaryPreferences, Boolean bool4, List list2, List list3, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, str4, z11, z12, str5, str6, bool, str7, bool2, list, userGender, bool3, dietaryPreferences, bool4, list2, list3);
    }

    public /* synthetic */ UserData(int i11, String str, String str2, String str3, String str4, boolean z11, boolean z12, String str5, String str6, Boolean bool, String str7, Boolean bool2, List list, UserGender userGender, Boolean bool3, DietaryPreferences dietaryPreferences, Boolean bool4, List list2, List list3, m1 m1Var, DefaultConstructorMarker defaultConstructorMarker) {
        this(i11, str, str2, str3, str4, z11, z12, str5, str6, bool, str7, bool2, list, userGender, bool3, dietaryPreferences, bool4, list2, list3, m1Var);
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0013\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00060\t¢\u0006\u0004\b\n\u0010\u000bR\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/app/tgtg/model/remote/UserData$Companion;", "", "<init>", "()V", "", Constants.BRAZE_PUSH_SUMMARY_TEXT_KEY, "Lcom/app/tgtg/model/remote/UserData;", "fromJson", "(Ljava/lang/String;)Lcom/app/tgtg/model/remote/UserData;", "Lkotlinx/serialization/KSerializer;", "serializer", "()Lkotlinx/serialization/KSerializer;", "Ln90/c;", "json", "Ln90/c;", "app"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final UserData fromJson(@NotNull String s7) {
            s7.getClass();
            return (UserData) UserData.json.b(serializer(), s7);
        }

        @NotNull
        public final KSerializer serializer() {
            return UserData$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    private UserData(String str, String str2, String str3, String str4, boolean z11, boolean z12, String str5, String str6, Boolean bool, String str7, Boolean bool2, List<UserAddress> list, UserGender userGender, Boolean bool3, DietaryPreferences dietaryPreferences, Boolean bool4, List<String> list2, List<OnboardingUserAddress> list3) {
        str.getClass();
        str2.getClass();
        this.userId = str;
        this.name = str2;
        this.email = str3;
        this.phoneNumber = str4;
        this.newsletterOptIn = z11;
        this.pushNotificationOptIn = z12;
        this.phoneCountryCode = str5;
        this.countryCode = str6;
        this.dataSharingOptOut = bool;
        this.birthDate = str7;
        this.clearDateOfBirth = bool2;
        this.userAddresses = list;
        this.gender = userGender;
        this.clearGender = bool3;
        this.dietary = dietaryPreferences;
        this.clearDietary = bool4;
        this.collectionTimes = list2;
        this.userPointsOfInterests = list3;
    }

    @i90.g("date_of_birth")
    public static /* synthetic */ void getBirthDate$annotations() {
    }

    @i90.g("clear_date_of_birth")
    public static /* synthetic */ void getClearDateOfBirth$annotations() {
    }

    @i90.g("clear_food_preferences")
    public static /* synthetic */ void getClearDietary$annotations() {
    }

    @i90.g("clear_gender")
    public static /* synthetic */ void getClearGender$annotations() {
    }

    @i90.g("collection_times")
    public static /* synthetic */ void getCollectionTimes$annotations() {
    }

    @i90.g("country_id")
    private static /* synthetic */ void getCountryCode$annotations() {
    }

    @i90.g("data_sharing_opt_out")
    public static /* synthetic */ void getDataSharingOptOut$annotations() {
    }

    @i90.g("food_preferences")
    public static /* synthetic */ void getDietary$annotations() {
    }

    @i90.g("email")
    public static /* synthetic */ void getEmail$annotations() {
    }

    @i90.g("gender")
    public static /* synthetic */ void getGender$annotations() {
    }

    @i90.g("name")
    public static /* synthetic */ void getName$annotations() {
    }

    @i90.g("newsletter_opt_in")
    public static /* synthetic */ void getNewsletterOptIn$annotations() {
    }

    @i90.g("phone_country_code")
    public static /* synthetic */ void getPhoneCountryCode$annotations() {
    }

    @i90.g("phone_number")
    public static /* synthetic */ void getPhoneNumber$annotations() {
    }

    @i90.g("push_notifications_opt_in")
    public static /* synthetic */ void getPushNotificationOptIn$annotations() {
    }

    @i90.g("user_addresses")
    public static /* synthetic */ void getUserAddresses$annotations() {
    }

    @i90.g("user_id")
    /* JADX INFO: renamed from: getUserId-8nKqa5U$annotations, reason: not valid java name */
    public static /* synthetic */ void m282getUserId8nKqa5U$annotations() {
    }

    @i90.g("user_points_of_interest")
    public static /* synthetic */ void getUserPointsOfInterests$annotations() {
    }

    public /* synthetic */ UserData(String str, String str2, String str3, String str4, boolean z11, boolean z12, String str5, String str6, Boolean bool, String str7, Boolean bool2, List list, UserGender userGender, Boolean bool3, DietaryPreferences dietaryPreferences, Boolean bool4, List list2, List list3, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i11 & 2) != 0 ? "" : str2, (i11 & 4) != 0 ? null : str3, (i11 & 8) != 0 ? "" : str4, (i11 & 16) != 0 ? false : z11, (i11 & 32) != 0 ? false : z12, (i11 & 64) != 0 ? null : str5, (i11 & 128) != 0 ? null : str6, (i11 & 256) != 0 ? null : bool, (i11 & 512) != 0 ? null : str7, (i11 & 1024) != 0 ? null : bool2, (i11 & NewHope.SENDB_BYTES) != 0 ? null : list, (i11 & 4096) != 0 ? null : userGender, (i11 & 8192) != 0 ? null : bool3, (i11 & BrotliInputStream.DEFAULT_INTERNAL_BUFFER_SIZE) != 0 ? null : dietaryPreferences, (32768 & i11) != 0 ? null : bool4, (65536 & i11) != 0 ? null : list2, (i11 & 131072) != 0 ? null : list3, null);
    }
}
