package in.sp.main.api;

import java.util.Date;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import in.sp.main.entities.Orders;
import in.sp.main.services.OrderService;

@RestController
@RequestMapping("/api")
public class OrdersApi
{
	@Autowired
	private OrderService orderService;
	
		
	@PostMapping("/storeOrderDetails")
	public ResponseEntity<String> storeUserOrdersDetails(@RequestBody Orders orders)
	{
		 Date date = new Date();
	    orders.setCourseId(UUID.randomUUID().toString());
		
		orderService.storeUserOrders(orders);
		System.out.println(orders.getUserEmail());
		return ResponseEntity.ok("Order details stored successfully");
	}
	
// 	<!-- KEY -- rzp_test_7YsgwUDPBhTo4X
// KEY-secret -Vk3H8dzPbNHiL5NNyiSR0TRK -->
	
// 	@PostMapping("/storeOrderDetails")
// 	public ResponseEntity<String> storeUserOrdersDetails(@RequestBody Orders orders) throws RazorpayException
// 	{
// 		RazorpayClient razorpayClient = new RazorpayClient("rzp_test_7YsgwUDPBhTo4X", "Vk3H8dzPbNHiL5NNyiSR0TRK");

// 		JSONObject orderRequest = new JSONObject();
// 		orderRequest.put("amount", orders.getCourseAmount());
// 		orderRequest.put("currency","INR");
// 		orderRequest.put("receipt", "rcpt_id_"+System.currentTimeMillis());

// 		Order order = razorpayClient.orders.create(orderRequest);
// //		System.out.println(order);
		
// 		String orderId = order.get("id");
// 		orders.setOrderId(orderId);
		
// 		orderService.storeUserOrders(orders);
// 		return ResponseEntity.ok("Order details stored successfully");
// 	}
}
