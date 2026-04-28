package zendesk.conversationkit.android.internal.rest.model;

import bb0.a;
import e0.f;
import i90.h;
import j4.s;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import l90.b;
import m90.c1;
import m90.d;
import m90.f0;
import m90.g;
import m90.m1;
import m90.q0;
import m90.r1;
import org.bouncycastle.i18n.TextBundle;
import org.bouncycastle.pqc.crypto.newhope.NewHope;
import org.brotli.dec.BrotliInputStream;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import u70.j;
import u70.l;
import u70.m;
import w2.l1;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
@h
@Metadata(d1 = {"\u0000\u0084\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b\u0006\n\u0002\u0010$\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b0\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b-\b\u0081\b\u0018\u0000 \u008e\u00012\u00020\u0001:\u0004\u008f\u0001\u008e\u0001B¯\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\f\u001a\u00020\u0002\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002\u0012\u0014\u0010\u0012\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0011\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017\u0012\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019\u0012\u000e\u0010\u001c\u001a\n\u0012\u0004\u0012\u00020\u001b\u0018\u00010\u0006\u0012\u000e\u0010\u001e\u001a\n\u0012\u0004\u0012\u00020\u001d\u0018\u00010\u0006\u0012\b\u0010 \u001a\u0004\u0018\u00010\u001f\u0012\b\u0010\"\u001a\u0004\u0018\u00010!\u0012\u000e\u0010$\u001a\n\u0012\u0004\u0012\u00020#\u0018\u00010\u0006\u0012\b\u0010%\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010'\u001a\u0004\u0018\u00010&\u0012\b\u0010(\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010)\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b*\u0010+BË\u0002\b\u0010\u0012\u0006\u0010-\u001a\u00020,\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002\u0012\u0014\u0010\u0012\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0011\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017\u0012\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019\u0012\u000e\u0010\u001c\u001a\n\u0012\u0004\u0012\u00020\u001b\u0018\u00010\u0006\u0012\u000e\u0010\u001e\u001a\n\u0012\u0004\u0012\u00020\u001d\u0018\u00010\u0006\u0012\b\u0010 \u001a\u0004\u0018\u00010\u001f\u0012\b\u0010\"\u001a\u0004\u0018\u00010!\u0012\u000e\u0010$\u001a\n\u0012\u0004\u0012\u00020#\u0018\u00010\u0006\u0012\b\u0010%\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010'\u001a\u0004\u0018\u00010&\u0012\b\u0010(\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010)\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010/\u001a\u0004\u0018\u00010.¢\u0006\u0004\b*\u00100J\u0010\u00101\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b1\u00102J\u0010\u00103\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b3\u00102J\u0010\u00104\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b4\u00102J\u0018\u00105\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b5\u00106J\u0012\u00107\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b7\u00102J\u0012\u00108\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b8\u00102J\u0010\u00109\u001a\u00020\nHÆ\u0003¢\u0006\u0004\b9\u0010:J\u0010\u0010;\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b;\u00102J\u0012\u0010<\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b<\u00102J\u0012\u0010=\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b=\u00102J\u0012\u0010>\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b>\u00102J\u0012\u0010?\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b?\u00102J\u001e\u0010@\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0011HÆ\u0003¢\u0006\u0004\b@\u0010AJ\u0012\u0010B\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\bB\u00102J\u0012\u0010C\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\bC\u00102J\u0012\u0010D\u001a\u0004\u0018\u00010\u0015HÆ\u0003¢\u0006\u0004\bD\u0010EJ\u0012\u0010F\u001a\u0004\u0018\u00010\u0017HÆ\u0003¢\u0006\u0004\bF\u0010GJ\u0012\u0010H\u001a\u0004\u0018\u00010\u0019HÆ\u0003¢\u0006\u0004\bH\u0010IJ\u0018\u0010J\u001a\n\u0012\u0004\u0012\u00020\u001b\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\bJ\u00106J\u0018\u0010K\u001a\n\u0012\u0004\u0012\u00020\u001d\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\bK\u00106J\u0012\u0010L\u001a\u0004\u0018\u00010\u001fHÆ\u0003¢\u0006\u0004\bL\u0010MJ\u0012\u0010N\u001a\u0004\u0018\u00010!HÆ\u0003¢\u0006\u0004\bN\u0010OJ\u0018\u0010P\u001a\n\u0012\u0004\u0012\u00020#\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\bP\u00106J\u0012\u0010Q\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\bQ\u00102J\u0012\u0010R\u001a\u0004\u0018\u00010&HÆ\u0003¢\u0006\u0004\bR\u0010SJ\u0012\u0010T\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\bT\u00102J\u0012\u0010U\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\bU\u00102Jî\u0002\u0010V\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\f\u001a\u00020\u00022\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00022\u0016\b\u0002\u0010\u0012\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00112\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00152\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00172\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u00192\u0010\b\u0002\u0010\u001c\u001a\n\u0012\u0004\u0012\u00020\u001b\u0018\u00010\u00062\u0010\b\u0002\u0010\u001e\u001a\n\u0012\u0004\u0012\u00020\u001d\u0018\u00010\u00062\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u001f2\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010!2\u0010\b\u0002\u0010$\u001a\n\u0012\u0004\u0012\u00020#\u0018\u00010\u00062\n\b\u0002\u0010%\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010'\u001a\u0004\u0018\u00010&2\n\b\u0002\u0010(\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010)\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\bV\u0010WJ\u0010\u0010X\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\bX\u00102J\u0010\u0010Y\u001a\u00020,HÖ\u0001¢\u0006\u0004\bY\u0010ZJ\u001a\u0010\\\u001a\u00020!2\b\u0010[\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\\\u0010]J'\u0010f\u001a\u00020c2\u0006\u0010^\u001a\u00020\u00002\u0006\u0010`\u001a\u00020_2\u0006\u0010b\u001a\u00020aH\u0001¢\u0006\u0004\bd\u0010eR \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010g\u0012\u0004\bi\u0010j\u001a\u0004\bh\u00102R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010g\u001a\u0004\bk\u00102R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010g\u001a\u0004\bl\u00102R\u001f\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010m\u001a\u0004\bn\u00106R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010g\u001a\u0004\bo\u00102R\u0019\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010g\u001a\u0004\bp\u00102R\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010q\u001a\u0004\br\u0010:R\u0017\u0010\f\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\f\u0010g\u001a\u0004\bs\u00102R\u0019\u0010\r\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\r\u0010g\u001a\u0004\bt\u00102R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u000e\u0010g\u001a\u0004\bu\u00102R\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u000f\u0010g\u001a\u0004\bv\u00102R\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010g\u001a\u0004\bw\u00102R%\u0010\u0012\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00118\u0006¢\u0006\f\n\u0004\b\u0012\u0010x\u001a\u0004\by\u0010AR\u0019\u0010\u0013\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010g\u001a\u0004\bz\u00102R\u0019\u0010\u0014\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010g\u001a\u0004\b{\u00102R\u0019\u0010\u0016\u001a\u0004\u0018\u00010\u00158\u0006¢\u0006\f\n\u0004\b\u0016\u0010|\u001a\u0004\b}\u0010ER\u0019\u0010\u0018\u001a\u0004\u0018\u00010\u00178\u0006¢\u0006\f\n\u0004\b\u0018\u0010~\u001a\u0004\b\u007f\u0010GR\u001b\u0010\u001a\u001a\u0004\u0018\u00010\u00198\u0006¢\u0006\u000e\n\u0005\b\u001a\u0010\u0080\u0001\u001a\u0005\b\u0081\u0001\u0010IR \u0010\u001c\u001a\n\u0012\u0004\u0012\u00020\u001b\u0018\u00010\u00068\u0006¢\u0006\r\n\u0004\b\u001c\u0010m\u001a\u0005\b\u0082\u0001\u00106R \u0010\u001e\u001a\n\u0012\u0004\u0012\u00020\u001d\u0018\u00010\u00068\u0006¢\u0006\r\n\u0004\b\u001e\u0010m\u001a\u0005\b\u0083\u0001\u00106R\u001b\u0010 \u001a\u0004\u0018\u00010\u001f8\u0006¢\u0006\u000e\n\u0005\b \u0010\u0084\u0001\u001a\u0005\b\u0085\u0001\u0010MR\u001b\u0010\"\u001a\u0004\u0018\u00010!8\u0006¢\u0006\u000e\n\u0005\b\"\u0010\u0086\u0001\u001a\u0005\b\u0087\u0001\u0010OR \u0010$\u001a\n\u0012\u0004\u0012\u00020#\u0018\u00010\u00068\u0006¢\u0006\r\n\u0004\b$\u0010m\u001a\u0005\b\u0088\u0001\u00106R\u001a\u0010%\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\r\n\u0004\b%\u0010g\u001a\u0005\b\u0089\u0001\u00102R\u001b\u0010'\u001a\u0004\u0018\u00010&8\u0006¢\u0006\u000e\n\u0005\b'\u0010\u008a\u0001\u001a\u0005\b\u008b\u0001\u0010SR\u001a\u0010(\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\r\n\u0004\b(\u0010g\u001a\u0005\b\u008c\u0001\u00102R\u001a\u0010)\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\r\n\u0004\b)\u0010g\u001a\u0005\b\u008d\u0001\u00102¨\u0006\u0090\u0001"}, d2 = {"Lzendesk/conversationkit/android/internal/rest/model/MessageDto;", "", "", "id", "authorId", "role", "", "subroles", "name", "avatarUrl", "", "received", "type", TextBundle.TEXT_ENTRY, "textFallback", "altText", "payload", "", "metadata", "mediaUrl", "mediaType", "", "mediaSize", "Lzendesk/conversationkit/android/internal/rest/model/CoordinatesDto;", "coordinates", "Lzendesk/conversationkit/android/internal/rest/model/LocationDto;", "location", "Lzendesk/conversationkit/android/internal/rest/model/MessageActionDto;", "actions", "Lzendesk/conversationkit/android/internal/rest/model/MessageItemDto;", "items", "Lzendesk/conversationkit/android/internal/rest/model/DisplaySettingsDto;", "displaySettings", "", "blockChatInput", "Lzendesk/conversationkit/android/internal/rest/model/MessageFieldDto;", "fields", "quotedMessageId", "Lzendesk/conversationkit/android/internal/rest/model/MessageSourceDto;", "source", "attachmentId", "htmlText", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;DLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Lzendesk/conversationkit/android/internal/rest/model/CoordinatesDto;Lzendesk/conversationkit/android/internal/rest/model/LocationDto;Ljava/util/List;Ljava/util/List;Lzendesk/conversationkit/android/internal/rest/model/DisplaySettingsDto;Ljava/lang/Boolean;Ljava/util/List;Ljava/lang/String;Lzendesk/conversationkit/android/internal/rest/model/MessageSourceDto;Ljava/lang/String;Ljava/lang/String;)V", "", "seen0", "Lm90/m1;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;DLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Lzendesk/conversationkit/android/internal/rest/model/CoordinatesDto;Lzendesk/conversationkit/android/internal/rest/model/LocationDto;Ljava/util/List;Ljava/util/List;Lzendesk/conversationkit/android/internal/rest/model/DisplaySettingsDto;Ljava/lang/Boolean;Ljava/util/List;Ljava/lang/String;Lzendesk/conversationkit/android/internal/rest/model/MessageSourceDto;Ljava/lang/String;Ljava/lang/String;Lm90/m1;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "()Ljava/util/List;", "component5", "component6", "component7", "()D", "component8", "component9", "component10", "component11", "component12", "component13", "()Ljava/util/Map;", "component14", "component15", "component16", "()Ljava/lang/Long;", "component17", "()Lzendesk/conversationkit/android/internal/rest/model/CoordinatesDto;", "component18", "()Lzendesk/conversationkit/android/internal/rest/model/LocationDto;", "component19", "component20", "component21", "()Lzendesk/conversationkit/android/internal/rest/model/DisplaySettingsDto;", "component22", "()Ljava/lang/Boolean;", "component23", "component24", "component25", "()Lzendesk/conversationkit/android/internal/rest/model/MessageSourceDto;", "component26", "component27", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;DLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Lzendesk/conversationkit/android/internal/rest/model/CoordinatesDto;Lzendesk/conversationkit/android/internal/rest/model/LocationDto;Ljava/util/List;Ljava/util/List;Lzendesk/conversationkit/android/internal/rest/model/DisplaySettingsDto;Ljava/lang/Boolean;Ljava/util/List;Ljava/lang/String;Lzendesk/conversationkit/android/internal/rest/model/MessageSourceDto;Ljava/lang/String;Ljava/lang/String;)Lzendesk/conversationkit/android/internal/rest/model/MessageDto;", "toString", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "self", "Ll90/b;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$zendesk_conversationkit_conversationkit_android", "(Lzendesk/conversationkit/android/internal/rest/model/MessageDto;Ll90/b;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "Ljava/lang/String;", "getId", "getId$annotations", "()V", "getAuthorId", "getRole", "Ljava/util/List;", "getSubroles", "getName", "getAvatarUrl", "D", "getReceived", "getType", "getText", "getTextFallback", "getAltText", "getPayload", "Ljava/util/Map;", "getMetadata", "getMediaUrl", "getMediaType", "Ljava/lang/Long;", "getMediaSize", "Lzendesk/conversationkit/android/internal/rest/model/CoordinatesDto;", "getCoordinates", "Lzendesk/conversationkit/android/internal/rest/model/LocationDto;", "getLocation", "getActions", "getItems", "Lzendesk/conversationkit/android/internal/rest/model/DisplaySettingsDto;", "getDisplaySettings", "Ljava/lang/Boolean;", "getBlockChatInput", "getFields", "getQuotedMessageId", "Lzendesk/conversationkit/android/internal/rest/model/MessageSourceDto;", "getSource", "getAttachmentId", "getHtmlText", "Companion", "$serializer", "zendesk.conversationkit_conversationkit-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class MessageDto {

    @NotNull
    private static final j[] $childSerializers;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @Nullable
    private final List<MessageActionDto> actions;

    @Nullable
    private final String altText;

    @Nullable
    private final String attachmentId;

    @NotNull
    private final String authorId;

    @Nullable
    private final String avatarUrl;

    @Nullable
    private final Boolean blockChatInput;

    @Nullable
    private final CoordinatesDto coordinates;

    @Nullable
    private final DisplaySettingsDto displaySettings;

    @Nullable
    private final List<MessageFieldDto> fields;

    @Nullable
    private final String htmlText;

    @NotNull
    private final String id;

    @Nullable
    private final List<MessageItemDto> items;

    @Nullable
    private final LocationDto location;

    @Nullable
    private final Long mediaSize;

    @Nullable
    private final String mediaType;

    @Nullable
    private final String mediaUrl;

    @Nullable
    private final Map<String, Object> metadata;

    @Nullable
    private final String name;

    @Nullable
    private final String payload;

    @Nullable
    private final String quotedMessageId;
    private final double received;

    @NotNull
    private final String role;

    @Nullable
    private final MessageSourceDto source;

    @Nullable
    private final List<String> subroles;

    @Nullable
    private final String text;

    @Nullable
    private final String textFallback;

    @NotNull
    private final String type;

    static {
        m mVar = m.PUBLICATION;
        $childSerializers = new j[]{null, null, null, l.a(mVar, new a(7)), null, null, null, null, null, null, null, null, l.a(mVar, new a(8)), null, null, null, null, null, l.a(mVar, new a(9)), l.a(mVar, new a(10)), null, null, l.a(mVar, new a(11)), null, null, null, null};
    }

    public /* synthetic */ MessageDto(int i11, String str, String str2, String str3, List list, String str4, String str5, double d3, String str6, String str7, String str8, String str9, String str10, Map map, String str11, String str12, Long l, CoordinatesDto coordinatesDto, LocationDto locationDto, List list2, List list3, DisplaySettingsDto displaySettingsDto, Boolean bool, List list4, String str13, MessageSourceDto messageSourceDto, String str14, String str15, m1 m1Var) {
        if (134217727 != (i11 & 134217727)) {
            c1.j(i11, 134217727, MessageDto$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.id = str;
        this.authorId = str2;
        this.role = str3;
        this.subroles = list;
        this.name = str4;
        this.avatarUrl = str5;
        this.received = d3;
        this.type = str6;
        this.text = str7;
        this.textFallback = str8;
        this.altText = str9;
        this.payload = str10;
        this.metadata = map;
        this.mediaUrl = str11;
        this.mediaType = str12;
        this.mediaSize = l;
        this.coordinates = coordinatesDto;
        this.location = locationDto;
        this.actions = list2;
        this.items = list3;
        this.displaySettings = displaySettingsDto;
        this.blockChatInput = bool;
        this.fields = list4;
        this.quotedMessageId = str13;
        this.source = messageSourceDto;
        this.attachmentId = str14;
        this.htmlText = str15;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
        return new d(r1.f29848a, 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_$0() {
        return new f0(r1.f29848a, new i90.a(Reflection.getOrCreateKotlinClass(Object.class), new KSerializer[0]), 1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_$1() {
        return new d(MessageActionDto$$serializer.INSTANCE, 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_$2() {
        return new d(MessageItemDto$$serializer.INSTANCE, 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_$3() {
        return new d(MessageFieldDto$$serializer.INSTANCE, 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ MessageDto copy$default(MessageDto messageDto, String str, String str2, String str3, List list, String str4, String str5, double d3, String str6, String str7, String str8, String str9, String str10, Map map, String str11, String str12, Long l, CoordinatesDto coordinatesDto, LocationDto locationDto, List list2, List list3, DisplaySettingsDto displaySettingsDto, Boolean bool, List list4, String str13, MessageSourceDto messageSourceDto, String str14, String str15, int i11, Object obj) {
        String str16;
        String str17;
        String str18 = (i11 & 1) != 0 ? messageDto.id : str;
        String str19 = (i11 & 2) != 0 ? messageDto.authorId : str2;
        String str20 = (i11 & 4) != 0 ? messageDto.role : str3;
        List list5 = (i11 & 8) != 0 ? messageDto.subroles : list;
        String str21 = (i11 & 16) != 0 ? messageDto.name : str4;
        String str22 = (i11 & 32) != 0 ? messageDto.avatarUrl : str5;
        double d11 = (i11 & 64) != 0 ? messageDto.received : d3;
        String str23 = (i11 & 128) != 0 ? messageDto.type : str6;
        String str24 = (i11 & 256) != 0 ? messageDto.text : str7;
        String str25 = (i11 & 512) != 0 ? messageDto.textFallback : str8;
        String str26 = (i11 & 1024) != 0 ? messageDto.altText : str9;
        String str27 = (i11 & NewHope.SENDB_BYTES) != 0 ? messageDto.payload : str10;
        Map map2 = (i11 & 4096) != 0 ? messageDto.metadata : map;
        String str28 = str18;
        String str29 = (i11 & 8192) != 0 ? messageDto.mediaUrl : str11;
        String str30 = (i11 & BrotliInputStream.DEFAULT_INTERNAL_BUFFER_SIZE) != 0 ? messageDto.mediaType : str12;
        Long l7 = (i11 & 32768) != 0 ? messageDto.mediaSize : l;
        CoordinatesDto coordinatesDto2 = (i11 & 65536) != 0 ? messageDto.coordinates : coordinatesDto;
        LocationDto locationDto2 = (i11 & 131072) != 0 ? messageDto.location : locationDto;
        List list6 = (i11 & 262144) != 0 ? messageDto.actions : list2;
        List list7 = (i11 & 524288) != 0 ? messageDto.items : list3;
        DisplaySettingsDto displaySettingsDto2 = (i11 & 1048576) != 0 ? messageDto.displaySettings : displaySettingsDto;
        Boolean bool2 = (i11 & 2097152) != 0 ? messageDto.blockChatInput : bool;
        List list8 = (i11 & 4194304) != 0 ? messageDto.fields : list4;
        String str31 = (i11 & 8388608) != 0 ? messageDto.quotedMessageId : str13;
        MessageSourceDto messageSourceDto2 = (i11 & 16777216) != 0 ? messageDto.source : messageSourceDto;
        String str32 = (i11 & 33554432) != 0 ? messageDto.attachmentId : str14;
        if ((i11 & 67108864) != 0) {
            str17 = str32;
            str16 = messageDto.htmlText;
        } else {
            str16 = str15;
            str17 = str32;
        }
        return messageDto.copy(str28, str19, str20, list5, str21, str22, d11, str23, str24, str25, str26, str27, map2, str29, str30, l7, coordinatesDto2, locationDto2, list6, list7, displaySettingsDto2, bool2, list8, str31, messageSourceDto2, str17, str16);
    }

    public static final /* synthetic */ void write$Self$zendesk_conversationkit_conversationkit_android(MessageDto self, b output, SerialDescriptor serialDesc) {
        j[] jVarArr = $childSerializers;
        output.q(serialDesc, 0, self.id);
        output.q(serialDesc, 1, self.authorId);
        output.q(serialDesc, 2, self.role);
        output.r(serialDesc, 3, (KSerializer) jVarArr[3].getValue(), self.subroles);
        r1 r1Var = r1.f29848a;
        output.r(serialDesc, 4, r1Var, self.name);
        output.r(serialDesc, 5, r1Var, self.avatarUrl);
        output.z(serialDesc, 6, self.received);
        output.q(serialDesc, 7, self.type);
        output.r(serialDesc, 8, r1Var, self.text);
        output.r(serialDesc, 9, r1Var, self.textFallback);
        output.r(serialDesc, 10, r1Var, self.altText);
        output.r(serialDesc, 11, r1Var, self.payload);
        output.r(serialDesc, 12, (KSerializer) jVarArr[12].getValue(), self.metadata);
        output.r(serialDesc, 13, r1Var, self.mediaUrl);
        output.r(serialDesc, 14, r1Var, self.mediaType);
        output.r(serialDesc, 15, q0.f29842a, self.mediaSize);
        output.r(serialDesc, 16, CoordinatesDto$$serializer.INSTANCE, self.coordinates);
        output.r(serialDesc, 17, LocationDto$$serializer.INSTANCE, self.location);
        output.r(serialDesc, 18, (KSerializer) jVarArr[18].getValue(), self.actions);
        output.r(serialDesc, 19, (KSerializer) jVarArr[19].getValue(), self.items);
        output.r(serialDesc, 20, DisplaySettingsDto$$serializer.INSTANCE, self.displaySettings);
        output.r(serialDesc, 21, g.f29797a, self.blockChatInput);
        output.r(serialDesc, 22, (KSerializer) jVarArr[22].getValue(), self.fields);
        output.r(serialDesc, 23, r1Var, self.quotedMessageId);
        output.r(serialDesc, 24, MessageSourceDto$$serializer.INSTANCE, self.source);
        output.r(serialDesc, 25, r1Var, self.attachmentId);
        output.r(serialDesc, 26, r1Var, self.htmlText);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    @Nullable
    /* JADX INFO: renamed from: component10, reason: from getter */
    public final String getTextFallback() {
        return this.textFallback;
    }

    @Nullable
    /* JADX INFO: renamed from: component11, reason: from getter */
    public final String getAltText() {
        return this.altText;
    }

    @Nullable
    /* JADX INFO: renamed from: component12, reason: from getter */
    public final String getPayload() {
        return this.payload;
    }

    @Nullable
    public final Map<String, Object> component13() {
        return this.metadata;
    }

    @Nullable
    /* JADX INFO: renamed from: component14, reason: from getter */
    public final String getMediaUrl() {
        return this.mediaUrl;
    }

    @Nullable
    /* JADX INFO: renamed from: component15, reason: from getter */
    public final String getMediaType() {
        return this.mediaType;
    }

    @Nullable
    /* JADX INFO: renamed from: component16, reason: from getter */
    public final Long getMediaSize() {
        return this.mediaSize;
    }

    @Nullable
    /* JADX INFO: renamed from: component17, reason: from getter */
    public final CoordinatesDto getCoordinates() {
        return this.coordinates;
    }

    @Nullable
    /* JADX INFO: renamed from: component18, reason: from getter */
    public final LocationDto getLocation() {
        return this.location;
    }

    @Nullable
    public final List<MessageActionDto> component19() {
        return this.actions;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getAuthorId() {
        return this.authorId;
    }

    @Nullable
    public final List<MessageItemDto> component20() {
        return this.items;
    }

    @Nullable
    /* JADX INFO: renamed from: component21, reason: from getter */
    public final DisplaySettingsDto getDisplaySettings() {
        return this.displaySettings;
    }

    @Nullable
    /* JADX INFO: renamed from: component22, reason: from getter */
    public final Boolean getBlockChatInput() {
        return this.blockChatInput;
    }

    @Nullable
    public final List<MessageFieldDto> component23() {
        return this.fields;
    }

    @Nullable
    /* JADX INFO: renamed from: component24, reason: from getter */
    public final String getQuotedMessageId() {
        return this.quotedMessageId;
    }

    @Nullable
    /* JADX INFO: renamed from: component25, reason: from getter */
    public final MessageSourceDto getSource() {
        return this.source;
    }

    @Nullable
    /* JADX INFO: renamed from: component26, reason: from getter */
    public final String getAttachmentId() {
        return this.attachmentId;
    }

    @Nullable
    /* JADX INFO: renamed from: component27, reason: from getter */
    public final String getHtmlText() {
        return this.htmlText;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getRole() {
        return this.role;
    }

    @Nullable
    public final List<String> component4() {
        return this.subroles;
    }

    @Nullable
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getName() {
        return this.name;
    }

    @Nullable
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getAvatarUrl() {
        return this.avatarUrl;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final double getReceived() {
        return this.received;
    }

    @NotNull
    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getType() {
        return this.type;
    }

    @Nullable
    /* JADX INFO: renamed from: component9, reason: from getter */
    public final String getText() {
        return this.text;
    }

    @NotNull
    public final MessageDto copy(@NotNull String id2, @NotNull String authorId, @NotNull String role, @Nullable List<String> subroles, @Nullable String name, @Nullable String avatarUrl, double received, @NotNull String type, @Nullable String text, @Nullable String textFallback, @Nullable String altText, @Nullable String payload, @Nullable Map<String, ? extends Object> metadata, @Nullable String mediaUrl, @Nullable String mediaType, @Nullable Long mediaSize, @Nullable CoordinatesDto coordinates, @Nullable LocationDto location, @Nullable List<MessageActionDto> actions, @Nullable List<MessageItemDto> items, @Nullable DisplaySettingsDto displaySettings, @Nullable Boolean blockChatInput, @Nullable List<MessageFieldDto> fields, @Nullable String quotedMessageId, @Nullable MessageSourceDto source, @Nullable String attachmentId, @Nullable String htmlText) {
        id2.getClass();
        authorId.getClass();
        role.getClass();
        type.getClass();
        return new MessageDto(id2, authorId, role, subroles, name, avatarUrl, received, type, text, textFallback, altText, payload, metadata, mediaUrl, mediaType, mediaSize, coordinates, location, actions, items, displaySettings, blockChatInput, fields, quotedMessageId, source, attachmentId, htmlText);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MessageDto)) {
            return false;
        }
        MessageDto messageDto = (MessageDto) other;
        return Intrinsics.areEqual(this.id, messageDto.id) && Intrinsics.areEqual(this.authorId, messageDto.authorId) && Intrinsics.areEqual(this.role, messageDto.role) && Intrinsics.areEqual(this.subroles, messageDto.subroles) && Intrinsics.areEqual(this.name, messageDto.name) && Intrinsics.areEqual(this.avatarUrl, messageDto.avatarUrl) && Double.compare(this.received, messageDto.received) == 0 && Intrinsics.areEqual(this.type, messageDto.type) && Intrinsics.areEqual(this.text, messageDto.text) && Intrinsics.areEqual(this.textFallback, messageDto.textFallback) && Intrinsics.areEqual(this.altText, messageDto.altText) && Intrinsics.areEqual(this.payload, messageDto.payload) && Intrinsics.areEqual(this.metadata, messageDto.metadata) && Intrinsics.areEqual(this.mediaUrl, messageDto.mediaUrl) && Intrinsics.areEqual(this.mediaType, messageDto.mediaType) && Intrinsics.areEqual(this.mediaSize, messageDto.mediaSize) && Intrinsics.areEqual(this.coordinates, messageDto.coordinates) && Intrinsics.areEqual(this.location, messageDto.location) && Intrinsics.areEqual(this.actions, messageDto.actions) && Intrinsics.areEqual(this.items, messageDto.items) && Intrinsics.areEqual(this.displaySettings, messageDto.displaySettings) && Intrinsics.areEqual(this.blockChatInput, messageDto.blockChatInput) && Intrinsics.areEqual(this.fields, messageDto.fields) && Intrinsics.areEqual(this.quotedMessageId, messageDto.quotedMessageId) && Intrinsics.areEqual(this.source, messageDto.source) && Intrinsics.areEqual(this.attachmentId, messageDto.attachmentId) && Intrinsics.areEqual(this.htmlText, messageDto.htmlText);
    }

    @Nullable
    public final List<MessageActionDto> getActions() {
        return this.actions;
    }

    @Nullable
    public final String getAltText() {
        return this.altText;
    }

    @Nullable
    public final String getAttachmentId() {
        return this.attachmentId;
    }

    @NotNull
    public final String getAuthorId() {
        return this.authorId;
    }

    @Nullable
    public final String getAvatarUrl() {
        return this.avatarUrl;
    }

    @Nullable
    public final Boolean getBlockChatInput() {
        return this.blockChatInput;
    }

    @Nullable
    public final CoordinatesDto getCoordinates() {
        return this.coordinates;
    }

    @Nullable
    public final DisplaySettingsDto getDisplaySettings() {
        return this.displaySettings;
    }

    @Nullable
    public final List<MessageFieldDto> getFields() {
        return this.fields;
    }

    @Nullable
    public final String getHtmlText() {
        return this.htmlText;
    }

    @NotNull
    public final String getId() {
        return this.id;
    }

    @Nullable
    public final List<MessageItemDto> getItems() {
        return this.items;
    }

    @Nullable
    public final LocationDto getLocation() {
        return this.location;
    }

    @Nullable
    public final Long getMediaSize() {
        return this.mediaSize;
    }

    @Nullable
    public final String getMediaType() {
        return this.mediaType;
    }

    @Nullable
    public final String getMediaUrl() {
        return this.mediaUrl;
    }

    @Nullable
    public final Map<String, Object> getMetadata() {
        return this.metadata;
    }

    @Nullable
    public final String getName() {
        return this.name;
    }

    @Nullable
    public final String getPayload() {
        return this.payload;
    }

    @Nullable
    public final String getQuotedMessageId() {
        return this.quotedMessageId;
    }

    public final double getReceived() {
        return this.received;
    }

    @NotNull
    public final String getRole() {
        return this.role;
    }

    @Nullable
    public final MessageSourceDto getSource() {
        return this.source;
    }

    @Nullable
    public final List<String> getSubroles() {
        return this.subroles;
    }

    @Nullable
    public final String getText() {
        return this.text;
    }

    @Nullable
    public final String getTextFallback() {
        return this.textFallback;
    }

    @NotNull
    public final String getType() {
        return this.type;
    }

    public int hashCode() {
        int iB = l1.b(l1.b(this.id.hashCode() * 31, 31, this.authorId), 31, this.role);
        List<String> list = this.subroles;
        int iHashCode = (iB + (list == null ? 0 : list.hashCode())) * 31;
        String str = this.name;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.avatarUrl;
        int iB2 = l1.b(s.b(this.received, (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31, 31), 31, this.type);
        String str3 = this.text;
        int iHashCode3 = (iB2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.textFallback;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.altText;
        int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.payload;
        int iHashCode6 = (iHashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
        Map<String, Object> map = this.metadata;
        int iHashCode7 = (iHashCode6 + (map == null ? 0 : map.hashCode())) * 31;
        String str7 = this.mediaUrl;
        int iHashCode8 = (iHashCode7 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.mediaType;
        int iHashCode9 = (iHashCode8 + (str8 == null ? 0 : str8.hashCode())) * 31;
        Long l = this.mediaSize;
        int iHashCode10 = (iHashCode9 + (l == null ? 0 : l.hashCode())) * 31;
        CoordinatesDto coordinatesDto = this.coordinates;
        int iHashCode11 = (iHashCode10 + (coordinatesDto == null ? 0 : coordinatesDto.hashCode())) * 31;
        LocationDto locationDto = this.location;
        int iHashCode12 = (iHashCode11 + (locationDto == null ? 0 : locationDto.hashCode())) * 31;
        List<MessageActionDto> list2 = this.actions;
        int iHashCode13 = (iHashCode12 + (list2 == null ? 0 : list2.hashCode())) * 31;
        List<MessageItemDto> list3 = this.items;
        int iHashCode14 = (iHashCode13 + (list3 == null ? 0 : list3.hashCode())) * 31;
        DisplaySettingsDto displaySettingsDto = this.displaySettings;
        int iHashCode15 = (iHashCode14 + (displaySettingsDto == null ? 0 : displaySettingsDto.hashCode())) * 31;
        Boolean bool = this.blockChatInput;
        int iHashCode16 = (iHashCode15 + (bool == null ? 0 : bool.hashCode())) * 31;
        List<MessageFieldDto> list4 = this.fields;
        int iHashCode17 = (iHashCode16 + (list4 == null ? 0 : list4.hashCode())) * 31;
        String str9 = this.quotedMessageId;
        int iHashCode18 = (iHashCode17 + (str9 == null ? 0 : str9.hashCode())) * 31;
        MessageSourceDto messageSourceDto = this.source;
        int iHashCode19 = (iHashCode18 + (messageSourceDto == null ? 0 : messageSourceDto.hashCode())) * 31;
        String str10 = this.attachmentId;
        int iHashCode20 = (iHashCode19 + (str10 == null ? 0 : str10.hashCode())) * 31;
        String str11 = this.htmlText;
        return iHashCode20 + (str11 != null ? str11.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        String str = this.id;
        String str2 = this.authorId;
        String str3 = this.role;
        List<String> list = this.subroles;
        String str4 = this.name;
        String str5 = this.avatarUrl;
        double d3 = this.received;
        String str6 = this.type;
        String str7 = this.text;
        String str8 = this.textFallback;
        String str9 = this.altText;
        String str10 = this.payload;
        Map<String, Object> map = this.metadata;
        String str11 = this.mediaUrl;
        String str12 = this.mediaType;
        Long l = this.mediaSize;
        CoordinatesDto coordinatesDto = this.coordinates;
        LocationDto locationDto = this.location;
        List<MessageActionDto> list2 = this.actions;
        List<MessageItemDto> list3 = this.items;
        DisplaySettingsDto displaySettingsDto = this.displaySettings;
        Boolean bool = this.blockChatInput;
        List<MessageFieldDto> list4 = this.fields;
        String str13 = this.quotedMessageId;
        MessageSourceDto messageSourceDto = this.source;
        String str14 = this.attachmentId;
        String str15 = this.htmlText;
        StringBuilder sbT = f.t("MessageDto(id=", str, ", authorId=", str2, ", role=");
        sbT.append(str3);
        sbT.append(", subroles=");
        sbT.append(list);
        sbT.append(", name=");
        s.A(sbT, str4, ", avatarUrl=", str5, ", received=");
        sbT.append(d3);
        sbT.append(", type=");
        sbT.append(str6);
        s.A(sbT, ", text=", str7, ", textFallback=", str8);
        s.A(sbT, ", altText=", str9, ", payload=", str10);
        sbT.append(", metadata=");
        sbT.append(map);
        sbT.append(", mediaUrl=");
        sbT.append(str11);
        sbT.append(", mediaType=");
        sbT.append(str12);
        sbT.append(", mediaSize=");
        sbT.append(l);
        sbT.append(", coordinates=");
        sbT.append(coordinatesDto);
        sbT.append(", location=");
        sbT.append(locationDto);
        sbT.append(", actions=");
        sbT.append(list2);
        sbT.append(", items=");
        sbT.append(list3);
        sbT.append(", displaySettings=");
        sbT.append(displaySettingsDto);
        sbT.append(", blockChatInput=");
        sbT.append(bool);
        sbT.append(", fields=");
        sbT.append(list4);
        sbT.append(", quotedMessageId=");
        sbT.append(str13);
        sbT.append(", source=");
        sbT.append(messageSourceDto);
        sbT.append(", attachmentId=");
        sbT.append(str14);
        return f.n(sbT, ", htmlText=", str15, ")");
    }

    public MessageDto(@NotNull String str, @NotNull String str2, @NotNull String str3, @Nullable List<String> list, @Nullable String str4, @Nullable String str5, double d3, @NotNull String str6, @Nullable String str7, @Nullable String str8, @Nullable String str9, @Nullable String str10, @Nullable Map<String, ? extends Object> map, @Nullable String str11, @Nullable String str12, @Nullable Long l, @Nullable CoordinatesDto coordinatesDto, @Nullable LocationDto locationDto, @Nullable List<MessageActionDto> list2, @Nullable List<MessageItemDto> list3, @Nullable DisplaySettingsDto displaySettingsDto, @Nullable Boolean bool, @Nullable List<MessageFieldDto> list4, @Nullable String str13, @Nullable MessageSourceDto messageSourceDto, @Nullable String str14, @Nullable String str15) {
        str.getClass();
        str2.getClass();
        str3.getClass();
        str6.getClass();
        this.id = str;
        this.authorId = str2;
        this.role = str3;
        this.subroles = list;
        this.name = str4;
        this.avatarUrl = str5;
        this.received = d3;
        this.type = str6;
        this.text = str7;
        this.textFallback = str8;
        this.altText = str9;
        this.payload = str10;
        this.metadata = map;
        this.mediaUrl = str11;
        this.mediaType = str12;
        this.mediaSize = l;
        this.coordinates = coordinatesDto;
        this.location = locationDto;
        this.actions = list2;
        this.items = list3;
        this.displaySettings = displaySettingsDto;
        this.blockChatInput = bool;
        this.fields = list4;
        this.quotedMessageId = str13;
        this.source = messageSourceDto;
        this.attachmentId = str14;
        this.htmlText = str15;
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lzendesk/conversationkit/android/internal/rest/model/MessageDto$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lzendesk/conversationkit/android/internal/rest/model/MessageDto;", "zendesk.conversationkit_conversationkit-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        @NotNull
        public final KSerializer serializer() {
            return MessageDto$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @i90.g("_id")
    public static /* synthetic */ void getId$annotations() {
    }
}
