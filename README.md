# Java-Exercises
1. CLOSEST POINT ON 2D CIRCLE.

Description:

Find the point on the 2D circle that is closest to the given point.

Input:

Five reals:
1.      2D coordinates of the point.
2.      2D coordinates of the circle center.
3.      Circle radius.

The distance between the given point and the center of the circle is greater than 1e-8.

Output:

Two reals, the 2D coordinates of the closest point.

Project code: ClosestPointOn2DCircle

2. GREATEST COMMON DIVISOR

Description:

There are two positive numbers a and b. Find their greatest common divisor.

Input:

Two positive integers:
1.      a.
2.      b.

Output:

An integer, the greatest common divisor of a and b.

Project code: GreatestCommonDivisor

3. LONGEST INCREASING SUBARRAY

Description:

There is a sequence of numbers. Find the longest increasing subsequence that consists of neighboring elements.

Input:

An array of integers:
1.      Quantity of the members in the sequence.
2.      Members of the sequence.

Output:

An integer, the quantity of members of the longest increasing subsequence that consists of neighboring elements.

Project code: LongestIncreasingSubarray

4. REVERSE ORDER

Description:

There is a sequence of numbers. Print it in reverse order.

Input:
1.      An array of positive integers.

2.      Termination number -1.

Output:

An array of integers:

1.      The input array in reverse order.

2.      Termination number -1.

Project code: ReverseOrder

5. WORKSHOP

Description:

Develop a material management program for a workshop that makes different objects of either new wooden boards or recycled waste.

The production using new boards outputs waste that can be recycled to manufacture other products. The production using the recycled waste does not output waste. If there is enough recycled waste, the workshop uses it to produce the next item; otherwise, it uses only the new wooden boards.

There are two types of waste: sawdust and trimming.

The workshop produces three types of furniture:

1.      Table:

·        Main materials:                5 boards per unit

·        Alternative materials:     10 kg of sawdust

·        Waste:                                2 kg of sawdust and 1 kg of trimming

2.      Chair:

·        Main materials:                3 boards per unit

·        Alternative materials:     5 kg of sawdust

·        Waste:                                2 kg of trimming

3.      Door:

·        Main materials:                4 boards per unit

·        Alternative materials:     10 kg of trimming

·        Waste:                                1 kg of sawdust

The production order of the items is the same as their order in the input array. Initially, there is no waste.

An item is not produced if there are not enough materials for its production. Production stops if there are not enough materials to produce any item.

Input:
1.      An integer, the quantity of new wooden boards at the workshop.

2.      An array of integers containing the items ordered for production: table (1), chair (2), and/or door (3).

3.      Termination number -1.

Output:

Three integers, the amounts of the materials remained after production:
1.      Boards.

2.      Sawdust.

3.      Trimmings.

Project code: Workshop
