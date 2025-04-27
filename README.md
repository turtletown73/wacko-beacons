# Wacko Beacons

## What is this?

This is a proof of concept that shows a problem with minecraft, allowing players to obtain beacon level 2+ effects with beacon level 1 and regeneration 2 entirely client side.

## Why did you make it?

Why not?

## How does this even work?

### Part 1 - Regeneration II

Minecraft beacons work in a weird way: it has 2 seperate effects, primary and secondary. The secondary can be the same as the primary and isn't checked server side if its a valid primary/secondary and only checks if its a valid beacon effect. When it's the same as the primary, you get a level II effect, but even in that case mojang makes sure theres 4 layers on server side. So this part is only useful for Regeneration II on a beacon.

All I had to do was add regeneration to the list of primary spells on the client and it worked!

### Part 2: Electric Boogaloo - Saving diamonds

Turns out despite checking for a valid effect, it still doesn't check if the effect is obtainable with the beacon level. So, you can get Strength I with 9 blocks of diamonds instead of the usual 50, quite the money save.

Now all I did was enable all the buttons on the client even if it's not the right level, not really that hard!
